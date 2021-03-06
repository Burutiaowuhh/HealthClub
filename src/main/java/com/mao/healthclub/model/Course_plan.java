package com.mao.healthclub.model;

import java.util.Date;

public class Course_plan {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_plan.id
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_plan.service_id
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    private Integer serviceId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_plan.coach_id
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    private Integer coachId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_plan.start_date
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    private Date startDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_plan.cycle
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    private Integer cycle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_plan.plan
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    private String plan;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_plan.start_time
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    private Integer startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_plan.end_time
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    private Integer endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_plan.term
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    private Integer term;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_plan.price
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    private Double price;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_plan.id
     *
     * @return the value of course_plan.id
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_plan.id
     *
     * @param id the value for course_plan.id
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_plan.service_id
     *
     * @return the value of course_plan.service_id
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    public Integer getServiceId() {
        return serviceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_plan.service_id
     *
     * @param serviceId the value for course_plan.service_id
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_plan.coach_id
     *
     * @return the value of course_plan.coach_id
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    public Integer getCoachId() {
        return coachId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_plan.coach_id
     *
     * @param coachId the value for course_plan.coach_id
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    public void setCoachId(Integer coachId) {
        this.coachId = coachId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_plan.start_date
     *
     * @return the value of course_plan.start_date
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_plan.start_date
     *
     * @param startDate the value for course_plan.start_date
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_plan.cycle
     *
     * @return the value of course_plan.cycle
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    public Integer getCycle() {
        return cycle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_plan.cycle
     *
     * @param cycle the value for course_plan.cycle
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    public void setCycle(Integer cycle) {
        this.cycle = cycle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_plan.plan
     *
     * @return the value of course_plan.plan
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    public String getPlan() {
        return plan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_plan.plan
     *
     * @param plan the value for course_plan.plan
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    public void setPlan(String plan) {
        this.plan = plan == null ? null : plan.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_plan.start_time
     *
     * @return the value of course_plan.start_time
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    public Integer getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_plan.start_time
     *
     * @param startTime the value for course_plan.start_time
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_plan.end_time
     *
     * @return the value of course_plan.end_time
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    public Integer getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_plan.end_time
     *
     * @param endTime the value for course_plan.end_time
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_plan.term
     *
     * @return the value of course_plan.term
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    public Integer getTerm() {
        return term;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_plan.term
     *
     * @param term the value for course_plan.term
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    public void setTerm(Integer term) {
        this.term = term;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_plan.price
     *
     * @return the value of course_plan.price
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    public Double getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_plan.price
     *
     * @param price the value for course_plan.price
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    public void setPrice(Double price) {
        this.price = price;
    }
}