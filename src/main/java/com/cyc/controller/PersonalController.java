package com.cyc.controller;

import com.cyc.common.ServerResponse;
import com.cyc.pojo.Personal;
import com.cyc.service.IPersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/personal/")
public class PersonalController {

    @Autowired
    private IPersonalService iPersonalService;

    @RequestMapping(value="set.do",method= RequestMethod.POST)
    @ResponseBody
    public ServerResponse setPersonalInfo(Personal record){
        return iPersonalService.setPersonalInfo(record);
    }

    @RequestMapping(value="update.do",method= RequestMethod.POST)
    @ResponseBody
    public ServerResponse updatePersonalInfo(Personal record){
        return iPersonalService.updatePersonalInfo(record);
    }

    @RequestMapping(value="delete.do",method= RequestMethod.POST)
    @ResponseBody
    public ServerResponse deletePersonalInfo(String wechatId){
        return iPersonalService.deletePersonalInfo(wechatId);
    }
}
