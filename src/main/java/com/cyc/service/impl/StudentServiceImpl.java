package com.cyc.service.impl;

import com.cyc.common.ServerResponse;
import com.cyc.dao.StudentMapper;
import com.cyc.pojo.Student;
import com.cyc.service.IStudentService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("iStudentService")
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private StudentMapper studentMapper;

    public ServerResponse<String> setStudentInfo(Student record){
        String wechatId = record.getWechatId();
        if (StringUtils.isBlank(wechatId)){
            return ServerResponse.createByErrorMessage("Need to pass in wechatId");
        }
        ServerResponse existResponse = this.checkExists(wechatId);
        // student info exists in db
        if(existResponse.isSuccess()){
            return existResponse;
        }
        studentMapper.insert(record);
        return ServerResponse.createBySuccessMessage("student info added");
    }

    public ServerResponse<String> updateStudentInfo(Student record){
        String wechatId = record.getWechatId();
        if (StringUtils.isBlank(wechatId)){
            return ServerResponse.createByErrorMessage("Need to pass in wechatId");
        }
        ServerResponse existResponse = this.checkExists(wechatId);
        // student info doesn't exist in db
        if(!existResponse.isSuccess()){
            return existResponse;
        }
        studentMapper.updateByPrimaryKey(record);
        return ServerResponse.createBySuccessMessage("student info updated");
    }

    public ServerResponse<String> deleteStudentInfo(String wechatId){
        ServerResponse existResponse = this.checkExists(wechatId);
        if (StringUtils.isBlank(wechatId)){
            return ServerResponse.createByErrorMessage("Need to pass in wechatId");
        }
        // student info doesn't exist in db
        if(!existResponse.isSuccess()){
            return existResponse;
        }
        studentMapper.deleteByPrimaryKey(wechatId);
        return ServerResponse.createBySuccessMessage("student info deleted");
    }

    public ServerResponse<String> checkExists(String wechatId){
        int resultCount = studentMapper.checkExists(wechatId);
        if(resultCount>0){
            return ServerResponse.createBySuccessMessage("wechat id exists");
        }
        return ServerResponse.createByErrorMessage("wechat id doesn't exist");
    }

}
