package com.cyc.dao;

import com.cyc.pojo.Employment;

public interface EmploymentMapper {
    int deleteByPrimaryKey(String wechatId);

    int insert(Employment record);

    int insertSelective(Employment record);

    Employment selectByPrimaryKey(String wechatId);

    int updateByPrimaryKeySelective(Employment record);

    int updateByPrimaryKey(Employment record);
}