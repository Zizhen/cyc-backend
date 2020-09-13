package com.cyc.pojo;

import java.util.Date;

public class Employment {
    private Integer uuid;

    private String name;

    private Integer reason;

    private String currentEmployer;

    private String position;

    private Date createTime;

    private Date updateTime;

    public Employment(Integer uuid, String name, Integer reason, String currentEmployer, String position, Date createTime, Date updateTime) {
        this.uuid = uuid;
        this.name = name;
        this.reason = reason;
        this.currentEmployer = currentEmployer;
        this.position = position;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Employment() {
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
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