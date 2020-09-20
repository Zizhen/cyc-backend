package com.cyc.dao;

import com.cyc.pojo.Student;

public interface StudentMapper {
    int deleteByPrimaryKey(String wechatId);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(String wechatId);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    int checkExists(String wechatId);
}