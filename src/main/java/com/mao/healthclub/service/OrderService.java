package com.mao.healthclub.service;

import com.mao.healthclub.mapper.Course_orderMapper;
import com.mao.healthclub.model.Course_order;
import com.mao.healthclub.model.Course_orderExample;
import com.mao.healthclub.model.LoginCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private Course_orderMapper course_orderMapper;

    public void getCOurse_order(LoginCustom user){
        Course_orderExample course_orderExample = new Course_orderExample();
        course_orderExample.createCriteria()
                .andCustomIdEqualTo(user.getId());
        List<Course_order> course_orders = course_orderMapper.selectByExample(course_orderExample);
    }

}
