package com.cxy.monitor.service;

import com.cxy.monitor.bean.Statistics;
import com.cxy.monitor.constants.NumberConstants;
import com.cxy.monitor.constants.StringConstants;
import com.cxy.monitor.mapper.PredictMapper;
import com.cxy.monitor.utils.TimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;

@Service
public class PredictService {

    @Autowired
    PredictMapper predictMapper;

    public List<Statistics> getData() {
        List<Statistics> statistics = predictMapper.selectMax5QuantityByTime(
                TimeUtils.defaultTime("alertCheck"), StringConstants.ENTRIES);
        // 添加统一的生产日期
        Date currentTime = TimeUtils.currentTime();
        for (int i = 0; i < statistics.size(); i++) {
            statistics.get(i).setCreateTime(currentTime);
        }
        return statistics;
    }
}
