package com.cxy.monitor.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Statistics {
    private String keyword;
    private Integer number;
    @JsonFormat(pattern = "HH:mm:ss")
    private Date createTime;

    public Statistics() {
    }

    public Statistics(String keyword, Integer number) {
        this.keyword = keyword;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Statistics{" +
                "keyword='" + keyword + '\'' +
                ", number=" + number +
                ", createTime=" + createTime +
                '}';
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
