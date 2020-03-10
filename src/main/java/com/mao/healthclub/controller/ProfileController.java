package com.mao.healthclub.controller;

import com.mao.healthclub.model.LoginCustom;
import com.mao.healthclub.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ProfileController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/profile/{action}")
    public String profilr(@PathVariable(name = "action") String action,
                          HttpServletRequest request,
                          Model model){
        LoginCustom user = (LoginCustom) request.getSession().getAttribute("user");
        if (user==null){
            return "redirect:/";
        }
        if (action.equals("order")){
            orderService.getCOurse_order(user);
        }
        return "profile";
    }
}
