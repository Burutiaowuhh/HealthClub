package com.mao.healthclub.service;

import com.mao.healthclub.dto.Course_planDTO;
import com.mao.healthclub.dto.PaginationDTO;
import com.mao.healthclub.mapper.Course_planMapper;
import com.mao.healthclub.mapper.ServiceMapper;
import com.mao.healthclub.model.Course_plan;
import com.mao.healthclub.model.Course_planExample;
import com.mao.healthclub.model.ServiceExample;
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
}
