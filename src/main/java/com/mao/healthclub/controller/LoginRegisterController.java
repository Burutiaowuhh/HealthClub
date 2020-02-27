package com.mao.healthclub.controller;

import com.mao.healthclub.model.Custom;
import com.mao.healthclub.model.LoginCustom;
import com.mao.healthclub.model.ReturnInfo;
import com.mao.healthclub.service.LogRegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.sql.Date;

@Controller
public class LoginRegisterController {

    @Autowired
    private LogRegService logRegService;

    @ResponseBody
    @RequestMapping(value = "/register_custom",method = RequestMethod.POST)
    public ReturnInfo register(@RequestParam("nickname") String nickname,
                               @RequestParam("username") String username,
                               @RequestParam("password") String password,
                               @RequestParam("sex") String sex,
                               @RequestParam("phone") String phone,
                               @RequestParam("birthday") Date birthday,
                               HttpServletRequest request){

        Custom custom=new Custom();
        custom.setNickname(nickname);
        custom.setUsername(username);
        custom.setPassword(password);
        custom.setSex(sex);
        custom.setPhone(phone);
        custom.setBirthday(birthday);

        Integer i = logRegService.register(custom);
        if (i==1){
            ReturnInfo returnInfo=new ReturnInfo();
            returnInfo.setCode(0);
            returnInfo.setMsg("success");
            return returnInfo;
        }else {
            ReturnInfo returnInfo=new ReturnInfo();
            returnInfo.setCode(1);
            returnInfo.setMsg("用户昵称已注册，请重新取一个用户昵称");
            return returnInfo;
        }
    }


    @ResponseBody
    @RequestMapping(value = "/login_custom",method = RequestMethod.POST)
    public ReturnInfo login(@RequestParam("log_nickname") String log_nickname,
                        @RequestParam("log_password") String log_password,
                            HttpServletRequest request){
        LoginCustom loginCustom = logRegService.login(log_nickname, log_password);
        if (loginCustom!=null){
            request.getSession().setAttribute("user",loginCustom);
            ReturnInfo returnInfo=new ReturnInfo();
            returnInfo.setCode(0);
            returnInfo.setMsg("success");
            return returnInfo;
        }else {
            ReturnInfo returnInfo=new ReturnInfo();
            returnInfo.setCode(1);
            returnInfo.setMsg("账户与密码不一致");
            return returnInfo;
        }
    }
}
