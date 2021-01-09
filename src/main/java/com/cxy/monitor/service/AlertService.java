package com.cxy.monitor.service;

import com.cxy.monitor.bean.Alert;
import com.cxy.monitor.bean.Level;
import com.cxy.monitor.bean.Statistics;
import com.cxy.monitor.bean.Reason;
import com.cxy.monitor.mapper.AlertMapper;
import com.cxy.monitor.utils.TimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@EnableScheduling
@Service
public class AlertService {

    @Autowired
    AlertMapper alertMapper;

    public List<Alert> searchAlerts(Date startTime) {
        // 处理startTime为空的情况
        if (startTime == null) {
            startTime = TimeUtils.defaultTime("alertSearch");
        }
        List<Alert> alerts = alertMapper.selectByTime(startTime);
        return alerts;
    }

//     定时任务，单位毫秒
    @Scheduled(fixedRate = 1000 * 60)
    public void checkAlerts() {
        System.out.println("执行定时任务" + LocalDateTime.now());
        checkQuantity();
//        checkGrowth();
    }

    // 检查条数（关键词相同，title不同）
    private void checkQuantity() {
        ArrayList<Alert> alerts = new ArrayList<>();
        List<Statistics> statisticses = alertMapper.selectQuantityByTime(TimeUtils.defaultTime("alertCheck"));
        System.out.println(statisticses);
        for (Statistics statistics : statisticses) {
            for (Level level: Level.values()) {
                if (statistics.getNumber() > level.getThreshold()) {
                    alerts.add(new Alert(statistics.getKeyword(), Reason.MUCHQUANTITY, level));
                }
            }
        }
        if (!alerts.isEmpty()) {
            System.out.println("开始进行批量插入");
            alertMapper.insertAlerts(alerts);
        }
    }

    private void checkGrowth() {
    }
}
