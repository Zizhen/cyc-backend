package com.cyc.dao;

import com.cyc.pojo.Employment;

public interface EmploymentMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(Employment record);

    int insertSelective(Employment record);

    Employment selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(Employment record);

    int updateByPrimaryKey(Employment record);
}