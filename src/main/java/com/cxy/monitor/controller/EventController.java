package com.cxy.monitor.controller;

import com.cxy.monitor.bean.Event;
import com.cxy.monitor.bean.SearchParams;
import com.cxy.monitor.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class EventController {

    @Autowired
    EventService eventService;

    @CrossOrigin
    @GetMapping("/search")
    public List<Event> getEvents(SearchParams params) {
        System.out.println("收到请求" + params.toString());
        List<Event> events = eventService.searchEvents(params);
        return events;
    }

    @CrossOrigin
    @GetMapping("/active")
    public void crawlData(@RequestParam("keyword") String keyword) {
        System.out.println("收到爬取请求：" + keyword);
        eventService.activeScrapy(keyword);
    }
}
