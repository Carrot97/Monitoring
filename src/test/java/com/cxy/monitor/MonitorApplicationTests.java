package com.cxy.monitor;

import com.cxy.monitor.bean.*;
import com.cxy.monitor.mapper.PredictMapper;
import com.cxy.monitor.service.PredictService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MonitorApplicationTests {

    @Autowired
    PredictMapper predictMapper;

    @Autowired
    PredictService predictService;

    @Test
    public void contextLoads() {
        List<Statistics> data = predictService.getData();
        for (Statistics statistics: data) {
            System.out.println(statistics);
        }
    }
}
