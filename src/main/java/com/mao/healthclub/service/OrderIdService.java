package com.mao.healthclub.service;

import com.mao.healthclub.mapper.OrderidMapper;
import com.mao.healthclub.model.Orderid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.NumberFormat;
import java.util.Calendar;

@Service
public class OrderIdService {

    @Autowired
    private OrderidMapper orderidMapper;

    public String makeOrderId(){
        Orderid orderid = orderidMapper.selectByPrimaryKey(1);
        Integer orderId1 = orderid.getOrderId();
        Orderid record = new Orderid();
        record.setId(orderid.getId());
        record.setOrderId(orderid.getOrderId()+1);
        orderidMapper.updateByPrimaryKey(record);

        //计算当前时间
        Calendar c1 = Calendar.getInstance();
        //获取当前年份
        int year = c1.get(Calendar.YEAR);
        //获取当前月份
        int month = c1.get(Calendar.MONTH) + 1;
        //获取当前日期
        int date = c1.get(Calendar.DATE);
        //不够两位数自动补零
        NumberFormat formatter   =   NumberFormat.getNumberInstance();
        formatter.setMinimumIntegerDigits(2);
        formatter.setGroupingUsed(false);
        String month1 = formatter.format(month);
        String date1 = formatter.format(date);

        //将年月日拼接起来
        StringBuffer sb=new StringBuffer();
        sb.append(year);  //2020
        sb.append(month1);  //202002
        sb.append(date1);   //20200218

        //如果orderid不够四位数，自动补零 19-->0019
        NumberFormat   formatter1   =   NumberFormat.getNumberInstance();
        formatter1.setMinimumIntegerDigits(4);
        formatter1.setGroupingUsed(false);
        String orderId = formatter1.format(orderId1);

        //将orderid拼接到年月日的后面
        sb.append(orderId);  //202002180019

        //将这个新生成的订单号返回给使用它的地方
        return String.valueOf(sb);
    }

}
