package com.mao.healthclub.model;

public class Service_price {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column service_price.id
     *
     * @mbg.generated Wed Feb 26 18:35:18 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column service_price.service_id
     *
     * @mbg.generated Wed Feb 26 18:35:18 CST 2020
     */
    private Integer serviceId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column service_price.price
     *
     * @mbg.generated Wed Feb 26 18:35:18 CST 2020
     */
    private Double price;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column service_price.id
     *
     * @return the value of service_price.id
     *
     * @mbg.generated Wed Feb 26 18:35:18 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column service_price.id
     *
     * @param id the value for service_price.id
     *
     * @mbg.generated Wed Feb 26 18:35:18 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column service_price.service_id
     *
     * @return the value of service_price.service_id
     *
     * @mbg.generated Wed Feb 26 18:35:18 CST 2020
     */
    public Integer getServiceId() {
        return serviceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column service_price.service_id
     *
     * @param serviceId the value for service_price.service_id
     *
     * @mbg.generated Wed Feb 26 18:35:18 CST 2020
     */
    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column service_price.price
     *
     * @return the value of service_price.price
     *
     * @mbg.generated Wed Feb 26 18:35:18 CST 2020
     */
    public Double getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column service_price.price
     *
     * @param price the value for service_price.price
     *
     * @mbg.generated Wed Feb 26 18:35:18 CST 2020
     */
    public void setPrice(Double price) {
        this.price = price;
    }
}