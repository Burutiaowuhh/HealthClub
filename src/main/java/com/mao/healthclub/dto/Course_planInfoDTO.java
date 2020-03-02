package com.mao.healthclub.dto;

import com.mao.healthclub.model.Coach;
import com.mao.healthclub.model.Course_plan;
import com.mao.healthclub.model.Service;
import lombok.Data;

import java.sql.Date;

@Data
public class Course_planInfoDTO {

    private Integer id;
    private Integer serviceId;
    private Integer coachId;
    private Date startDate;
    private Integer cycle;
    private String plan;
    private Integer startTime;
    private Integer endTime;
    private Integer term;
    private Double price;
    private Boolean isexpired;
    private Service service;
    private Coach coach;
}
