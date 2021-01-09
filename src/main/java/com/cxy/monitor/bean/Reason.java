package com.cxy.monitor.bean;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Reason {
    MUCHQUANTITY(0, "单位时间内关键词条数过多"),
    FASTGROWTH(1, "单条微博在单位时间内受关注过多");

    private final Integer id;

    @JsonValue
    private final String details;

    Reason(Integer id, String details) {
        this.id = id;
        this.details = details;
    }

    public Integer getId() {
        return id;
    }

    public String getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return "Reason{" +
                "id=" + id +
                ", details='" + details + '\'' +
                '}';
    }
}
