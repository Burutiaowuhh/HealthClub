package com.mao.healthclub.service;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.alipay.config.AlipayConfig;
import com.mao.healthclub.mapper.Course_orderMapper;
import com.mao.healthclub.mapper.Course_planMapper;
import com.mao.healthclub.mapper.Member_orderMapper;
import com.mao.healthclub.mapper.ServiceMapper;
import com.mao.healthclub.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.xml.crypto.Data;
import java.io.UnsupportedEncodingException;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.GregorianCalendar;

@Transactional
@Service
public class PayService {

    @Autowired
    private Course_orderMapper course_orderMapper;

    @Autowired
    private OrderIdService orderIdService;

    @Autowired
    private Course_planMapper course_planMapper;

    @Autowired
    private ServiceMapper serviceMapper;

    @Autowired
    private Member_orderMapper member_orderMapper;

    public String pay_course_plan(Integer course_plan_id, LoginCustom user) throws UnsupportedEncodingException, AlipayApiException {
        String trade_number = orderIdService.makeOrderId();
        Course_order course_order = new Course_order();
        course_order.setCoursePlanId(course_plan_id);
        course_order.setTradeNumber(trade_number);
        course_order.setCustomId(user.getId());
        Timestamp nowtime = new Timestamp(System.currentTimeMillis());
        course_order.setCreateOrderTime(nowtime);
        int i = course_orderMapper.insertSelective(course_order);
        if (i==0){
            return null;
        }

        Course_plan course_plan = course_planMapper.selectByPrimaryKey(course_plan_id);
        com.mao.healthclub.model.Service service = serviceMapper.selectByPrimaryKey(course_plan.getServiceId());
        String price = String.valueOf(course_plan.getPrice());
        String name = service.getName();
        //获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);

        //设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(AlipayConfig.return_url);
        alipayRequest.setNotifyUrl(AlipayConfig.notify_url);

        //商户订单号，商户网站订单系统中唯一订单号，必填
        String out_trade_no = new String(trade_number.getBytes("ISO-8859-1"),"UTF-8");
        //付款金额，必填
        String total_amount = new String(price.getBytes("ISO-8859-1"),"UTF-8");
        //订单名称，必填
        String subject = new String(name.getBytes("UTF-8"),"UTF-8");
        //商品描述，可空
//        String body = new String(request.getParameter("WIDbody").getBytes("ISO-8859-1"),"UTF-8");
        String body=null;

        alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","
                + "\"total_amount\":\""+ total_amount +"\","
                + "\"subject\":\""+ subject +"\","
                + "\"body\":\""+ body +"\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");


        //请求
        String result = alipayClient.pageExecute(alipayRequest).getBody();

        return result;
    }

    public String pay_member_order(LoginCustom user, String serve_time, String phone) throws UnsupportedEncodingException, AlipayApiException {


        String trade_number = orderIdService.makeOrderId();
        Member_order member_order = new Member_order();
        member_order.setCustomId(user.getId());
        Date date = new Date(System.currentTimeMillis());
        member_order.setStartDate(date);
        member_order.setTime(Integer.valueOf(serve_time));
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(calendar.MONTH, Integer.parseInt(serve_time));
        Date end_date = (Date) calendar.getTime();
        member_order.setEndDate(end_date);
        int money = 300 * Integer.valueOf(serve_time);
        member_order.setMoney(money);
        member_order.setPhone(phone);
        member_order.setTradeNumber(trade_number);
        int i = member_orderMapper.insertSelective(member_order);
        if (i==0){
            return null;
        }

        //获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);

        //设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(AlipayConfig.return_url);
        alipayRequest.setNotifyUrl(AlipayConfig.notify_url);

        //商户订单号，商户网站订单系统中唯一订单号，必填
        String out_trade_no = new String(trade_number.getBytes("ISO-8859-1"),"UTF-8");
        //付款金额，必填
        String money1 = String.valueOf(money);
        String total_amount = new String(money1.getBytes("ISO-8859-1"),"UTF-8");
        //订单名称，必填
        String subject = new String("健身会员".getBytes("UTF-8"),"UTF-8");
        //商品描述，可空
//        String body = new String(request.getParameter("WIDbody").getBytes("ISO-8859-1"),"UTF-8");
        String body=null;

        alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","
                + "\"total_amount\":\""+ total_amount +"\","
                + "\"subject\":\""+ subject +"\","
                + "\"body\":\""+ body +"\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");


        //请求
        String result = alipayClient.pageExecute(alipayRequest).getBody();

        return result;
    }
}
