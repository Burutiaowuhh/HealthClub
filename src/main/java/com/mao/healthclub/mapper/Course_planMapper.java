package com.mao.healthclub.mapper;

import com.mao.healthclub.model.Course_plan;
import com.mao.healthclub.model.Course_planExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Course_planMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_plan
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    long countByExample(Course_planExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_plan
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    int deleteByExample(Course_planExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_plan
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_plan
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    int insert(Course_plan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_plan
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    int insertSelective(Course_plan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_plan
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    List<Course_plan> selectByExampleWithRowbounds(Course_planExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_plan
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    List<Course_plan> selectByExample(Course_planExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_plan
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    Course_plan selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_plan
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    int updateByExampleSelective(@Param("record") Course_plan record, @Param("example") Course_planExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_plan
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    int updateByExample(@Param("record") Course_plan record, @Param("example") Course_planExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_plan
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    int updateByPrimaryKeySelective(Course_plan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_plan
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    int updateByPrimaryKey(Course_plan record);
}