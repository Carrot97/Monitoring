package com.cxy.monitor.bean;

import com.cxy.monitor.utils.TimeUtils;

import java.util.Date;

public class Alert {
    private Integer id;
    private Date time;
    private String keyword;
    private Reason reason;
    private Level level;

    public Alert() {
    }

    /**
     * 写入构造函数
     * 写入时自动补充当前时间
     **/
    public Alert(String keyword, Reason reason, Level level) {
        time = TimeUtils.currentTime();
        this.keyword = keyword;
        this.reason = reason;
        this.level = level;
    }

    // 取出构造函数
    public Alert(Integer id, Date time, String keyword, Reason reason, Level level) {
        this.id = id;
        this.time = time;
        this.keyword = keyword;
        this.reason = reason;
        this.level = level;
    }

    public Date getTime() {
        return time;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Reason getReason() {
        return reason;
    }

    public void setReason(Reason reason) {
        this.reason = reason;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}
