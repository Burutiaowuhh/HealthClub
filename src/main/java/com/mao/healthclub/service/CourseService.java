package com.mao.healthclub.service;

import com.mao.healthclub.dto.Course_planDTO;
import com.mao.healthclub.dto.Course_planInfoDTO;
import com.mao.healthclub.dto.PaginationDTO;
import com.mao.healthclub.mapper.CoachMapper;
import com.mao.healthclub.mapper.Course_planMapper;
import com.mao.healthclub.mapper.ServiceMapper;
import com.mao.healthclub.model.*;
import org.apache.ibatis.session.RowBounds;
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

    @Autowired
    private CoachMapper coachMapper;


    public List<Course_planDTO> getcourseplan(Integer page, Integer size) {
        Course_planExample course_planExample = new Course_planExample();
        course_planExample.setOrderByClause("start_date desc");
        Integer offset=size*(page-1);
        List<Course_plan> course_plans = course_planMapper.selectByExampleWithRowbounds(course_planExample,new RowBounds(offset,size));

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
            course_planDTO.setCourse_name(services.get(0).getName());
            course_planDTO.setCourse_introduction(services.get(0).getIntroduction());
            return course_planDTO;
        }).collect(Collectors.toList());
        System.out.println(list);
        return list;
    }

    public PaginationDTO getpageinfo(Integer page, Integer size) {
        int count = (int) course_planMapper.countByExample(new Course_planExample());
        PaginationDTO paginationDTO = new PaginationDTO();
        paginationDTO.setPagination(count,page,size);
        return paginationDTO;
    }

    public Course_planInfoDTO getcourseplanInfo(Integer course_planId) {
        Course_planExample course_planExample = new Course_planExample();
        course_planExample.createCriteria()
                .andIdEqualTo(course_planId);
        List<Course_plan> course_plans = course_planMapper.selectByExample(course_planExample);
        List<Course_planInfoDTO> course_planInfoDTOS = course_plans.stream().map(course_plan -> {
            Course_planInfoDTO course_planInfoDTO = new Course_planInfoDTO();
            BeanUtils.copyProperties(course_plan, course_planInfoDTO);
            Date startDate = course_plan.getStartDate();
            Date date = new Date();
            if (startDate.before(date)) {
                course_planInfoDTO.setIsexpired(false);
            } else {
                course_planInfoDTO.setIsexpired(true);
            }
            CoachExample coachExample = new CoachExample();
            coachExample.createCriteria()
                    .andIdEqualTo(course_plan.getCoachId());
            List<Coach> coaches = coachMapper.selectByExample(coachExample);
            course_planInfoDTO.setCoach(coaches.get(0));
            com.mao.healthclub.model.Service service = serviceMapper.selectByPrimaryKey(course_plan.getServiceId());
            course_planInfoDTO.setService(service);
            return course_planInfoDTO;
        }).collect(Collectors.toList());
        return course_planInfoDTOS.get(0);
    }
}
