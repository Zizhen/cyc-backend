package com.cyc.controller;

import com.cyc.common.HttpHeader;
import com.cyc.common.ServerResponse;
import com.cyc.pojo.Student;
import com.cyc.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/student/")
public class StudentController {

    @Autowired
    private IStudentService iStudentService;

    @RequestMapping(value="get.do",method= RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<ServerResponse> getStudentInfo(String wechatId){
        return new ResponseEntity<ServerResponse>(iStudentService.getStudentInfo(wechatId), new HttpHeader().headers, HttpStatus.OK);
    }

    @RequestMapping(value="set.do",method= RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<ServerResponse> setStudentInfo(Student record){
        return new ResponseEntity<ServerResponse>(iStudentService.setStudentInfo(record), new HttpHeader().headers, HttpStatus.OK);
    }

    @RequestMapping(value="update.do",method= RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<ServerResponse> updateStudentInfo(Student record){
        return new ResponseEntity<ServerResponse>(iStudentService.updateStudentInfo(record), new HttpHeader().headers, HttpStatus.OK);
    }

    @RequestMapping(value="delete.do",method= RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<ServerResponse> deleteStudentInfo(String wechatId){
        return new ResponseEntity<ServerResponse>(iStudentService.deleteStudentInfo(wechatId), new HttpHeader().headers, HttpStatus.OK);
    }
}
