package com.cxy.monitor.controller;

import com.cxy.monitor.bean.Alert;
import com.cxy.monitor.service.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;
import java.util.List;


@RestController
public class AlertController {

    @Autowired
    AlertService alertService;

    @CrossOrigin
    @GetMapping(value = "/alert")
    public List<Alert> getAlert(@RequestParam(value = "startTime", required = false) Date startTime) {
        System.out.println("收到alert请求");
        List<Alert> alerts = alertService.searchAlerts(startTime);
        return alerts;
    }
}
