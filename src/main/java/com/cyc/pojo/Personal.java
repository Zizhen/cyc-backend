package com.cyc.pojo;

import java.util.Date;

public class Personal {
    private String wechatId;

    private String studentName;

    private String gender;

    private String consultantName;

    private String school;

    private String major1;

    private String major2;

    private String minor;

    private Integer visa;

    private Date createTime;

    private Date updateTime;

    public Personal(String wechatId, String studentName, String gender, String consultantName, String school, String major1, String major2, String minor, Integer visa, Date createTime, Date updateTime) {
        this.wechatId = wechatId;
        this.studentName = studentName;
        this.gender = gender;
        this.consultantName = consultantName;
        this.school = school;
        this.major1 = major1;
        this.major2 = major2;
        this.minor = minor;
        this.visa = visa;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Personal() {
        super();
    }

    public String getWechatId() {
        return wechatId;
    }

    public void setWechatId(String wechatId) {
        this.wechatId = wechatId == null ? null : wechatId.trim();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getConsultantName() {
        return consultantName;
    }

    public void setConsultantName(String consultantName) {
        this.consultantName = consultantName == null ? null : consultantName.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getMajor1() {
        return major1;
    }

    public void setMajor1(String major1) {
        this.major1 = major1 == null ? null : major1.trim();
    }

    public String getMajor2() {
        return major2;
    }

    public void setMajor2(String major2) {
        this.major2 = major2 == null ? null : major2.trim();
    }

    public String getMinor() {
        return minor;
    }

    public void setMinor(String minor) {
        this.minor = minor == null ? null : minor.trim();
    }

    public Integer getVisa() {
        return visa;
    }

    public void setVisa(Integer visa) {
        this.visa = visa;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}