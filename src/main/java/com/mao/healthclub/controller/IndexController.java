package com.mao.healthclub.controller;

import com.mao.healthclub.dto.IndexCoachDTO;
import com.mao.healthclub.dto.IndexServiceDTO;
import com.mao.healthclub.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private IndexService indexService;

    @RequestMapping("/")
    public String index(Model model){
        List<IndexServiceDTO> indexServiceInfo = indexService.getIndexServiceInfo();
        List<IndexCoachDTO> indexCoachInfo = indexService.getIndexCoachInfo();
        model.addAttribute("indexServiceInfo",indexServiceInfo);
        model.addAttribute("indexCoachInfo",indexCoachInfo);
        return "index";
    }

    @RequestMapping("/index")
    public String index1(Model model){
        List<IndexServiceDTO> indexServiceInfo = indexService.getIndexServiceInfo();
        List<IndexCoachDTO> indexCoachInfo = indexService.getIndexCoachInfo();
        model.addAttribute("indexServiceInfo",indexServiceInfo);
        model.addAttribute("indexCoachInfo",indexCoachInfo);
        return "index";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }


}
