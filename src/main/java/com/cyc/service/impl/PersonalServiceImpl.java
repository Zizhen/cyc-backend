package com.cyc.service.impl;

import com.cyc.common.ServerResponse;
import com.cyc.dao.PersonalMapper;
import com.cyc.pojo.Personal;
import com.cyc.service.IPersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("iPersonalService")
public class PersonalServiceImpl implements IPersonalService {

    @Autowired
    private PersonalMapper personalMapper;

    public ServerResponse<String> setPersonalInfo(Personal record){
        ServerResponse existResponse = this.checkExists(record.getWechatId());
        // student info exists in db
        if(existResponse.isSuccess()){
            return existResponse;
        }
        personalMapper.insert(record);
        return ServerResponse.createBySuccessMessage("student personal info added");
    }

    public ServerResponse<String> updatePersonalInfo(Personal record){
        ServerResponse existResponse = this.checkExists(record.getWechatId());
        // student info doesn't exist in db
        if(!existResponse.isSuccess()){
            return existResponse;
        }
        personalMapper.updateByPrimaryKey(record);
        return ServerResponse.createBySuccessMessage("student personal info updated");
    }

    public ServerResponse<String> deletePersonalInfo(String wechatId){
        ServerResponse existResponse = this.checkExists(wechatId);
        // student info doesn't exist in db
        if(!existResponse.isSuccess()){
            return existResponse;
        }
        personalMapper.deleteByPrimaryKey(wechatId);
        return ServerResponse.createBySuccessMessage("student personal info deleted");
    }

    public ServerResponse<String> checkExists(String wechatId){
        int resultCount = personalMapper.checkExists(wechatId);
        if(resultCount>0){
            return ServerResponse.createBySuccessMessage("wechat id exists");
        }
        return ServerResponse.createByErrorMessage("wechat id doesn't exist");
    }
}
