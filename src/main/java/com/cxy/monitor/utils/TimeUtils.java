package com.cxy.monitor.utils;

import com.cxy.monitor.constants.NumberConstants;

import java.util.Date;

public class TimeUtils {

    public static Date defaultTime(String type) {
        Date result = null;
        switch (type) {
            case "event":
                result = new Date(System.currentTimeMillis() - NumberConstants.EVENTFLASHTIME1);
                break;
            case "alertSearch":
                result = new Date(System.currentTimeMillis() - NumberConstants.ALERTINTERVAL);
                break;
            case "alertCheck":
                result = new Date(System.currentTimeMillis() - NumberConstants.ALERTFLASHTIME);
                break;
        }
        return result;
    }

    public static Date currentTime() {
        return new Date(System.currentTimeMillis());
    }
}
