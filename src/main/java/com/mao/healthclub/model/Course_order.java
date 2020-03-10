package com.mao.healthclub.model;

import java.util.Date;

public class Course_order {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_order.id
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_order.trade_number
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    private String tradeNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_order.course_plan_id
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    private Integer coursePlanId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_order.custom_id
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    private Integer customId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_order.pay_status
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    private Boolean payStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_order.create_order_time
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    private Date createOrderTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_order.id
     *
     * @return the value of course_order.id
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_order.id
     *
     * @param id the value for course_order.id
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_order.trade_number
     *
     * @return the value of course_order.trade_number
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    public String getTradeNumber() {
        return tradeNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_order.trade_number
     *
     * @param tradeNumber the value for course_order.trade_number
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    public void setTradeNumber(String tradeNumber) {
        this.tradeNumber = tradeNumber == null ? null : tradeNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_order.course_plan_id
     *
     * @return the value of course_order.course_plan_id
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    public Integer getCoursePlanId() {
        return coursePlanId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_order.course_plan_id
     *
     * @param coursePlanId the value for course_order.course_plan_id
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    public void setCoursePlanId(Integer coursePlanId) {
        this.coursePlanId = coursePlanId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_order.custom_id
     *
     * @return the value of course_order.custom_id
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    public Integer getCustomId() {
        return customId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_order.custom_id
     *
     * @param customId the value for course_order.custom_id
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    public void setCustomId(Integer customId) {
        this.customId = customId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_order.pay_status
     *
     * @return the value of course_order.pay_status
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    public Boolean getPayStatus() {
        return payStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_order.pay_status
     *
     * @param payStatus the value for course_order.pay_status
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    public void setPayStatus(Boolean payStatus) {
        this.payStatus = payStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_order.create_order_time
     *
     * @return the value of course_order.create_order_time
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    public Date getCreateOrderTime() {
        return createOrderTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_order.create_order_time
     *
     * @param createOrderTime the value for course_order.create_order_time
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    public void setCreateOrderTime(Date createOrderTime) {
        this.createOrderTime = createOrderTime;
    }
}