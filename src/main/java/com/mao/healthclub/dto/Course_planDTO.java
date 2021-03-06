package com.mao.healthclub.dto;

import com.mao.healthclub.model.Coach;
import com.mao.healthclub.model.Course_plan;
import lombok.Data;

import java.sql.Date;

@Data
public class Course_planDTO {

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
    private String pic;
    private String course_name;
    private String course_introduction;
    private Boolean isexpired;
}
