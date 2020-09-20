package com.cyc.controller;

import com.cyc.common.ServerResponse;
import com.cyc.pojo.Student;
import com.cyc.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/student/")
public class StudentController {

    @Autowired
    private IStudentService iStudentService;

    @RequestMapping(value="set.do",method= RequestMethod.POST)
    @ResponseBody
    public ServerResponse setStudentInfo(Student record){
        return iStudentService.setStudentInfo(record);
    }

    @RequestMapping(value="update.do",method= RequestMethod.POST)
    @ResponseBody
    public ServerResponse updateStudentInfo(Student record){
        return iStudentService.updateStudentInfo(record);
    }

    @RequestMapping(value="delete.do",method= RequestMethod.POST)
    @ResponseBody
    public ServerResponse deleteStudentInfo(String wechatId){
        return iStudentService.deleteStudentInfo(wechatId);
    }
}
