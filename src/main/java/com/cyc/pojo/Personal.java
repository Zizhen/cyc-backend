package com.cyc.pojo;

public class Personal {
    private Integer uuid;

    private String studentName;

    private String email;

    private String wechatId;

    private String consultantName;

    private String school;

    private String major1;

    private String major2;

    private String minor;

    private Integer visa;

    public Personal(Integer uuid, String studentName, String email, String wechatId, String consultantName, String school, String major1, String major2, String minor, Integer visa) {
        this.uuid = uuid;
        this.studentName = studentName;
        this.email = email;
        this.wechatId = wechatId;
        this.consultantName = consultantName;
        this.school = school;
        this.major1 = major1;
        this.major2 = major2;
        this.minor = minor;
        this.visa = visa;
    }

    public Personal() {
        super();
    }

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getWechatId() {
        return wechatId;
    }

    public void setWechatId(String wechatId) {
        this.wechatId = wechatId == null ? null : wechatId.trim();
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
}