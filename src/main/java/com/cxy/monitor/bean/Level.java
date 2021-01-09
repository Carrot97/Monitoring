package com.cxy.monitor.bean;

import com.cxy.monitor.constants.NumberConstants;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Level {
    QUANTITYFIRST(0, "一级", NumberConstants.QUANTITYFIRSTTHRESHOLD),
    QUANTITYSECOND(1, "二级", NumberConstants.QUANTITYSECONDTHRESHOLD);
//    GROWTHFIRST(10, "一级", NumberConstants.GROWTHFIRSTTHRESHOLD),
//    GROWTHSECOND(11, "二级", NumberConstants.GROWTHSECONDTHRESHOLD);

    private final Integer id;

    @JsonValue
    private final String name;

    private final Integer threshold;

    Level(Integer id, String name, Integer threshold) {
        this.id = id;
        this.name = name;
        this.threshold = threshold;
    }

    @Override
    public String toString() {
        return "GrowthLevel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", threshold=" + threshold +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getThreshold() {
        return threshold;
    }
}
