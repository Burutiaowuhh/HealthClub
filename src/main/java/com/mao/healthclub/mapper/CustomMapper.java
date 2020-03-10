package com.mao.healthclub.mapper;

import com.mao.healthclub.model.Custom;
import com.mao.healthclub.model.CustomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CustomMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table custom
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    long countByExample(CustomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table custom
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    int deleteByExample(CustomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table custom
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table custom
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    int insert(Custom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table custom
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    int insertSelective(Custom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table custom
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    List<Custom> selectByExampleWithRowbounds(CustomExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table custom
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    List<Custom> selectByExample(CustomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table custom
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    Custom selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table custom
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    int updateByExampleSelective(@Param("record") Custom record, @Param("example") CustomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table custom
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    int updateByExample(@Param("record") Custom record, @Param("example") CustomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table custom
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    int updateByPrimaryKeySelective(Custom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table custom
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    int updateByPrimaryKey(Custom record);
}