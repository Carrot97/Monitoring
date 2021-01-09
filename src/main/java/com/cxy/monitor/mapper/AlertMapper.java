package com.cxy.monitor.mapper;

import com.cxy.monitor.bean.Alert;
import com.cxy.monitor.bean.Statistics;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public interface AlertMapper {

    List<Alert> selectByTime(Date startTime);

    // 根据关键词查询关键词相同title不同的微博数量
    List<Statistics> selectQuantityByTime(Date startTime);

    // 根据关键词查询关键词相同title不同的微博数量最多的五个
    List<Statistics> selectmax5QuantityByTime(Date startTime);

    // 批量插入报警信息
    void insertAlerts(ArrayList<Alert> alerts);
}
