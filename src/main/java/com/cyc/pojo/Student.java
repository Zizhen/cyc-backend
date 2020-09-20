package com.cyc.pojo;

import java.util.Date;

public class Student {
    private String wechatId;

    private String studentName;

    private String gender;

    private String consultantName;

    private String school;

    private String major1;

    private String major2;

    private String minor;

    private Integer packageName;

    private Integer contractStatus;

    private Integer paymentStatus;

    private Integer discount;

    private Integer paidAmount;

    private Date signedDate;

    private Integer reason;

    private String currentEmployer;

    private String jobPosition;

    private Date createTime;

    private Date updateTime;

    public Student(String wechatId, String studentName, String gender, String consultantName, String school, String major1, String major2, String minor, Integer packageName, Integer contractStatus, Integer paymentStatus, Integer discount, Integer paidAmount, Date signedDate, Integer reason, String currentEmployer, String jobPosition, Date createTime, Date updateTime) {
        this.wechatId = wechatId;
        this.studentName = studentName;
        this.gender = gender;
        this.consultantName = consultantName;
        this.school = school;
        this.major1 = major1;
        this.major2 = major2;
        this.minor = minor;
        this.packageName = packageName;
        this.contractStatus = contractStatus;
        this.paymentStatus = paymentStatus;
        this.discount = discount;
        this.paidAmount = paidAmount;
        this.signedDate = signedDate;
        this.reason = reason;
        this.currentEmployer = currentEmployer;
        this.jobPosition = jobPosition;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Student() {
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

    public Integer getPackageName() {
        return packageName;
    }

    public void setPackageName(Integer packageName) {
        this.packageName = packageName;
    }

    public Integer getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(Integer contractStatus) {
        this.contractStatus = contractStatus;
    }

    public Integer getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Integer paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Integer getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(Integer paidAmount) {
        this.paidAmount = paidAmount;
    }

    public Date getSignedDate() {
        return signedDate;
    }

    public void setSignedDate(Date signedDate) {
        this.signedDate = signedDate;
    }

    public Integer getReason() {
        return reason;
    }

    public void setReason(Integer reason) {
        this.reason = reason;
    }

    public String getCurrentEmployer() {
        return currentEmployer;
    }

    public void setCurrentEmployer(String currentEmployer) {
        this.currentEmployer = currentEmployer == null ? null : currentEmployer.trim();
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition == null ? null : jobPosition.trim();
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