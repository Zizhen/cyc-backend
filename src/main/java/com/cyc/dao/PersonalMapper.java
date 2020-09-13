package com.cyc.dao;

import com.cyc.pojo.Personal;

public interface PersonalMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(Personal record);

    int insertSelective(Personal record);

    Personal selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(Personal record);

    int updateByPrimaryKey(Personal record);
}