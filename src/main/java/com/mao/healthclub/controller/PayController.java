package com.mao.healthclub.controller;

import com.alipay.api.AlipayApiException;
import com.mao.healthclub.dto.Verify_courseDTO;
import com.mao.healthclub.mapper.Course_orderMapper;
import com.mao.healthclub.mapper.Course_planMapper;
import com.mao.healthclub.mapper.Member_orderMapper;
import com.mao.healthclub.model.*;
import com.mao.healthclub.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;

@RequestMapping("/pay")
@Controller
public class PayController {

    @Autowired
    private PayService payService;

    @Autowired
    private Course_orderMapper course_orderMapper;

    @Autowired
    private Member_orderMapper member_orderMapper;

    @ResponseBody
    @RequestMapping("/verify_course")
    public Verify_courseDTO verify_course(@RequestParam("course_plan_id") Integer course_plan_id,
                                HttpServletRequest request){
        LoginCustom user = (LoginCustom) request.getSession().getAttribute("user");
        System.out.println(user);
        if(user==null){
            Verify_courseDTO verify_courseDTO = new Verify_courseDTO();
            verify_courseDTO.setCode(1);
            verify_courseDTO.setMsg("您还没有登录，请先登录！");
            return verify_courseDTO;
        }

        Course_orderExample course_orderExample = new Course_orderExample();
        course_orderExample.createCriteria()
                .andCoursePlanIdEqualTo(course_plan_id)
                .andCustomIdEqualTo(user.getId());
        List<Course_order> course_orders = course_orderMapper.selectByExample(course_orderExample);
        Verify_courseDTO verify_courseDTO = new Verify_courseDTO();
        if (course_orders.size()!=0){
            verify_courseDTO.setCode(2);
            verify_courseDTO.setMsg("您已报名过此课程，无需重复报名！");
        }else {
            verify_courseDTO.setCode(3);
            verify_courseDTO.setMsg("未报名此课程");
        }
        return verify_courseDTO;
    }

    @ResponseBody
    @RequestMapping("/verify_user")
    public Verify_courseDTO verify_user(HttpServletRequest request){
        LoginCustom user = (LoginCustom) request.getSession().getAttribute("user");
        Verify_courseDTO verify_courseDTO = new Verify_courseDTO();
        if(user==null){
            verify_courseDTO.setCode(0);
            verify_courseDTO.setMsg("您还没有登录，请先登录！");
        }else {
            Member_orderExample example = new Member_orderExample();
            example.createCriteria()
                    .andCustomIdEqualTo(user.getId());
            example.setOrderByClause("desc");
            List<Member_order> member_orders = member_orderMapper.selectByExample(example);
            Date endDate = member_orders.get(0).getEndDate();
            Date date = new Date();
            if (endDate.after(date)) {
                verify_courseDTO.setCode(1);
                verify_courseDTO.setMsg("您的会员时间还未到期，如果想续期可前往个人中心续期");
            } else {
                verify_courseDTO.setCode(2);
                verify_courseDTO.setMsg("您已经登录");
            }
        }
        return verify_courseDTO;
    }


    @RequestMapping("/course")
    public String pay(@RequestParam(name = "course_plan_id") Integer course_plan_id,
                    ModelMap map,
                    HttpServletRequest request) throws UnsupportedEncodingException, AlipayApiException {

        LoginCustom user = (LoginCustom) request.getSession().getAttribute("user");
        String s = payService.pay_course_plan(course_plan_id, user);
        map.addAttribute("form",s);
        return "pay";
    }

    @RequestMapping("/order")
    public String pay(@RequestParam("serve_time") String serve_time,
                      @RequestParam("phone") String phone,
                      ModelMap modelMap,
                      HttpServletRequest request) throws UnsupportedEncodingException, AlipayApiException {
        LoginCustom user = (LoginCustom) request.getSession().getAttribute("user");
        String s = payService.pay_member_order(user, serve_time, phone);
        modelMap.addAttribute("form",s);
        return "pay";
    }

}
