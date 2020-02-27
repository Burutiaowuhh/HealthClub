package com.mao.healthclub.service;

import com.mao.healthclub.dto.Course_planDTO;
import com.mao.healthclub.mapper.Course_planMapper;
import com.mao.healthclub.mapper.ServiceMapper;
import com.mao.healthclub.model.Course_plan;
import com.mao.healthclub.model.Course_planExample;
import com.mao.healthclub.model.ServiceExample;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.DateUtils;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@Service
public class CourseService {

    @Autowired
    private Course_planMapper course_planMapper;

    @Autowired
    private ServiceMapper serviceMapper;

    public List<Course_planDTO> getcourseplan() {
        List<Course_plan> course_plans = course_planMapper.selectByExample(new Course_planExample());

        List<Course_planDTO> list = course_plans.stream().map(course_plan -> {
            Date startDate = course_plan.getStartDate();
            Date date = new Date();
            Course_planDTO course_planDTO = new Course_planDTO();
            BeanUtils.copyProperties(course_plan, course_planDTO);
            if (startDate.before(date)) {
                course_planDTO.setIsexpired(false);
            } else {
                course_planDTO.setIsexpired(true);
            }
            ServiceExample serviceExample = new ServiceExample();
            serviceExample.createCriteria()
                    .andIdEqualTo(course_plan.getServiceId());
            List<com.mao.healthclub.model.Service> services = serviceMapper.selectByExample(serviceExample);
            course_planDTO.setPic(services.get(0).getPic());
            return course_planDTO;
        }).collect(Collectors.toList());
        System.out.println(list);
        return list;
    }
}
