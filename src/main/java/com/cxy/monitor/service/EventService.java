package com.cxy.monitor.service;

import com.cxy.monitor.bean.Event;
import com.cxy.monitor.bean.SearchParams;
import com.cxy.monitor.constants.StringConstants;
import com.cxy.monitor.mapper.EventMapper;
import com.cxy.monitor.utils.CMDUtils;
import com.cxy.monitor.utils.HTTPUtils;
import com.cxy.monitor.utils.Transformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EventService {
    @Autowired
    EventMapper eventMapper;

    @Autowired
    RestTemplate restTemplate;

    // 取出爬取的数据
    public List<Event> searchEvents(SearchParams params) {
        List<Event> events = eventMapper.selectByParams(params);
//        for (Event event: events) {
//            System.out.println(event);
//        }
        // 去重操作
        HashMap<String, Event> hashMap = new HashMap<>();
        for (Event event : events) {
            hashMap.put(event.getTitle(), event);
        }
        // 将map转换为list输出
        return Transformer.map2list(hashMap);
    }


    // 主动激活scrapy爬虫
    public void activeScrapy(String keyword) {
//        HashMap<String, String> map = new HashMap<>();
//        map.put("term", keyword);
//        String result = sendGet(map);
//        System.out.println(result);
        String cmdLine = StringConstants.SCRAPYPOSITION + keyword;
        System.out.println(cmdLine);
        CMDUtils.excuteCMDCommand(cmdLine);
    }


    public String sendGet(Map<String, String> uriMap) {
        ResponseEntity responseEntity = restTemplate.getForEntity
                (
                        HTTPUtils.generateRequestParameters("http", "222.28.68.109:5000", uriMap),
                        String.class
                );
        return (String) responseEntity.getBody();
    }
}
