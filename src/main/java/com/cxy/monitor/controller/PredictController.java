package com.cxy.monitor.controller;

import com.cxy.monitor.bean.Statistics;
import com.cxy.monitor.service.PredictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class PredictController {

    @Autowired
    PredictService predictService;

    @GetMapping(value = "/predict")
    public List<Statistics> getNewData() {
        System.out.println("收到predict请求");
        List<Statistics> data = predictService.getData();
        return data;
    }
}
