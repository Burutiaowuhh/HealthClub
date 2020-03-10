package com.mao.healthclub.mapper;

import com.mao.healthclub.model.Coach;
import com.mao.healthclub.model.CoachExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CoachMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coach
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    long countByExample(CoachExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coach
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    int deleteByExample(CoachExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coach
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coach
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    int insert(Coach record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coach
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    int insertSelective(Coach record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coach
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    List<Coach> selectByExampleWithRowbounds(CoachExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coach
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    List<Coach> selectByExample(CoachExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coach
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    Coach selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coach
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    int updateByExampleSelective(@Param("record") Coach record, @Param("example") CoachExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coach
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    int updateByExample(@Param("record") Coach record, @Param("example") CoachExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coach
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    int updateByPrimaryKeySelective(Coach record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coach
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    int updateByPrimaryKey(Coach record);
}