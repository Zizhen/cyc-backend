package com.cyc.pojo;

import java.util.Date;

public class Payment {
    private Integer uuid;

    private String name;

    private Integer package;

    private Integer contractStatus;

    private Integer paymentStatus;

    private Integer discount;

    private Integer paidAmout;

    private Date signedDate;

    private Date createTime;

    private Date updateTime;

    public Payment(Integer uuid, String name, Integer package, Integer contractStatus, Integer paymentStatus, Integer discount, Integer paidAmout, Date signedDate, Date createTime, Date updateTime) {
        this.uuid = uuid;
        this.name = name;
        this.package = package;
        this.contractStatus = contractStatus;
        this.paymentStatus = paymentStatus;
        this.discount = discount;
        this.paidAmout = paidAmout;
        this.signedDate = signedDate;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Payment() {
        super();
    }

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPackage() {
        return package;
    }

    public void setPackage(Integer package) {
        this.package = package;
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

    public Integer getPaidAmout() {
        return paidAmout;
    }

    public void setPaidAmout(Integer paidAmout) {
        this.paidAmout = paidAmout;
    }

    public Date getSignedDate() {
        return signedDate;
    }

    public void setSignedDate(Date signedDate) {
        this.signedDate = signedDate;
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