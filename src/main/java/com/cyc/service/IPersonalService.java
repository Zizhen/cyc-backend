package com.cyc.service;

import com.cyc.common.ServerResponse;
import com.cyc.pojo.Personal;

public interface IPersonalService {

    ServerResponse<String> setPersonalInfo(Personal record);

    ServerResponse<String> updatePersonalInfo(Personal record);

    ServerResponse<String> deletePersonalInfo(String wechatId);

    ServerResponse<String> checkExists(String wechatId);
}
