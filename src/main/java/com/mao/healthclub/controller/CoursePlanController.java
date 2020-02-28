package com.mao.healthclub.controller;

import com.mao.healthclub.dto.Course_planDTO;
import com.mao.healthclub.dto.IndexCoachDTO;
import com.mao.healthclub.dto.IndexServiceDTO;
import com.mao.healthclub.service.CourseService;
import com.mao.healthclub.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CoursePlanController {

    @Autowired
    private CourseService courseService;
    @Autowired
    private IndexService indexService;
    @RequestMapping("/course")
    public String getcourseplan(Model model){
        List<Course_planDTO> course_planDTOS = courseService.getcourseplan();
        model.addAttribute("course_planDTOS",course_planDTOS);
        return "course";
    }

}
