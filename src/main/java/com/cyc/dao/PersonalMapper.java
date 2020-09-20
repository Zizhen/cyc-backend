package com.cyc.dao;

import com.cyc.common.ServerResponse;
import com.cyc.pojo.Personal;

public interface PersonalMapper {
    int deleteByPrimaryKey(String wechatId);

    int insert(Personal record);

    int insertSelective(Personal record);

    Personal selectByPrimaryKey(String wechatId);

    int updateByPrimaryKeySelective(Personal record);

    int updateByPrimaryKey(Personal record);

    int checkExists(String wechatId);
}