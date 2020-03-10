package com.mao.healthclub.controller;

import com.alipay.api.AlipayApiException;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.config.AlipayConfig;
import com.mao.healthclub.mapper.Course_orderMapper;
import com.mao.healthclub.mapper.Course_planMapper;
import com.mao.healthclub.mapper.Member_orderMapper;
import com.mao.healthclub.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Controller
public class ReturnUrlController {

    @Autowired
    private Member_orderMapper member_orderMapper;

    @Autowired
    private Course_orderMapper course_orderMapper;

    @RequestMapping("/return_url")
    public String return_url(HttpServletRequest request) throws UnsupportedEncodingException, AlipayApiException {
        Map<String,String> params = new HashMap<String,String>();
        Map<String,String[]> requestParams = request.getParameterMap();
        for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
            String name = (String) iter.next();
            String[] values = (String[]) requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i]
                        : valueStr + values[i] + ",";
            }
            //乱码解决，这段代码在出现乱码时使用
            valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
            params.put(name, valueStr);
        }

        boolean signVerified = AlipaySignature.rsaCheckV1(params, AlipayConfig.alipay_public_key, AlipayConfig.charset, AlipayConfig.sign_type); //调用SDK验证签名

        //——请在这里编写您的程序（以下代码仅作参考）——
        if(signVerified) {
            //商户订单号
            String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"),"UTF-8");
            Course_orderExample course_orderExample = new Course_orderExample();
            course_orderExample.createCriteria()
                    .andTradeNumberEqualTo(out_trade_no);
            List<Course_order> course_orders = course_orderMapper.selectByExample(course_orderExample);
            if (course_orders.size()!=0){
                Course_order course_order = new Course_order();
                course_order.setPayStatus(true);

                Course_orderExample example = new Course_orderExample();
                example.createCriteria()
                        .andTradeNumberEqualTo(out_trade_no);
                int i = course_orderMapper.updateByExampleSelective(course_order, example);
                return "redirect:/profile/order";
            }else {
                Member_orderExample member_orderExample = new Member_orderExample();
                member_orderExample.createCriteria()
                        .andTradeNumberEqualTo(out_trade_no);
                List<Member_order> member_orders = member_orderMapper.selectByExample(member_orderExample);
                if(member_orders.size()!=0){
                    Member_order record = new Member_order();
                    record.setPayStatus(true);
                    Member_orderExample example = new Member_orderExample();
                    example.createCriteria()
                            .andTradeNumberEqualTo(out_trade_no);
                    int i = member_orderMapper.updateByExampleSelective(record, example);
                    return "redirect:/profile/order";
                }
            }
        }
        return "redirect:/";
    }
}
