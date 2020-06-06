package com.mao.healthclub.mapper;

import com.mao.healthclub.model.Member_order;
import com.mao.healthclub.model.Member_orderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Member_orderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_order
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    long countByExample(Member_orderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_order
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    int deleteByExample(Member_orderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_order
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_order
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    int insert(Member_order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_order
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    int insertSelective(Member_order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_order
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    List<Member_order> selectByExampleWithRowbounds(Member_orderExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_order
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    List<Member_order> selectByExample(Member_orderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_order
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    Member_order selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_order
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    int updateByExampleSelective(@Param("record") Member_order record, @Param("example") Member_orderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_order
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    int updateByExample(@Param("record") Member_order record, @Param("example") Member_orderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_order
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    int updateByPrimaryKeySelective(Member_order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_order
     *
     * @mbg.generated Tue Mar 10 23:02:11 CST 2020
     */
    int updateByPrimaryKey(Member_order record);
}