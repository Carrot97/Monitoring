package com.cxy.monitor.bean;

import com.alibaba.druid.sql.parser.Keywords;
import com.cxy.monitor.utils.TimeUtils;

import java.util.Date;

public class SearchParams {
    private String keyword;

    private Date startTime;

    // 参数绑定采用空参构造器
    public SearchParams() {
        this.startTime = TimeUtils.defaultTime("event");
    }

//    public SearchParams(String keyword, Date startTime) {
//        this.keyword = keyword;
//        if (startTime != null) {
//            this.startTime = startTime;
//        } else {
//            this.startTime = TimeUtils.defaultTime("event");
//        }
//    }

    @Override
    public String toString() {
        return "SearchParams{" +
                "keyword='" + keyword + '\'' +
                ", startTime=" + startTime +
                '}';
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
}
