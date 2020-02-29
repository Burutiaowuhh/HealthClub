package com.mao.healthclub.controller;

import com.mao.healthclub.dto.Course_planDTO;
import com.mao.healthclub.dto.IndexCoachDTO;
import com.mao.healthclub.dto.IndexServiceDTO;
import com.mao.healthclub.dto.PaginationDTO;
import com.mao.healthclub.service.CourseService;
import com.mao.healthclub.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CoursePlanController {

    @Autowired
    private CourseService courseService;
    @RequestMapping("/course")
    public String getcourseplan(Model model,
                                @RequestParam(name = "page",defaultValue = "1") Integer page,
                                @RequestParam(name="size",defaultValue = "3") Integer size){
        List<Course_planDTO> course_planDTOS = courseService.getcourseplan(page,size);
        PaginationDTO paginationDTO = courseService.getpageinfo(page, size);
        model.addAttribute("course_planDTOS",course_planDTOS);
        model.addAttribute("paginationDTO",paginationDTO);
        return "course";
    }

}
