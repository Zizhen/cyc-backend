package com.cyc.service;

import com.cyc.common.ServerResponse;
import com.cyc.pojo.Student;

public interface IStudentService {

    ServerResponse<Student> getStudentInfo(String wechatId);

    ServerResponse<Student[]> getRecentStudentInfo();

    ServerResponse<String> setStudentInfo(Student record);

    ServerResponse<String> updateStudentInfo(Student record);

    ServerResponse<String> deleteStudentInfo(String wechatId);

    ServerResponse<String> checkExists(String wechatId);

}
