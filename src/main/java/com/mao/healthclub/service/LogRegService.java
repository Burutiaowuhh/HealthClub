package com.mao.healthclub.service;

import com.mao.healthclub.mapper.CustomMapper;
import com.mao.healthclub.model.Custom;
import com.mao.healthclub.model.CustomExample;
import com.mao.healthclub.model.LoginCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogRegService {

    @Autowired
    private CustomMapper customMapper;

    public Integer register(Custom custom) {
        CustomExample customExample = new CustomExample();
        customExample.createCriteria()
                .andNicknameEqualTo(custom.getNickname());
        List<Custom> customs = customMapper.selectByExample(customExample);
        if (customs.size()!=0){
            return 0;
        }

        //对密码加盐
        BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
        String passwordencode = encoder.encode(custom.getPassword());
        custom.setPassword(passwordencode);

        int i = customMapper.insertSelective(custom);

        return i;
    }

    public LoginCustom login(String log_nickname, String log_password) {

        CustomExample customExample = new CustomExample();
        customExample.createCriteria()
                .andNicknameEqualTo(log_nickname);
        List<Custom> customs = customMapper.selectByExample(customExample);

        if (customs.size()==0){
            System.out.println("没有此用户");
            return null;
        }
        BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
        boolean b = encoder.matches(log_password, customs.get(0).getPassword());
        if (b==true){
            LoginCustom loginCustom = new LoginCustom();
            loginCustom.setId(customs.get(0).getId());
            loginCustom.setNickname(customs.get(0).getNickname());
            return loginCustom;
        }else {
            System.out.println("密码不匹配");
            return null;
        }

    }
}
