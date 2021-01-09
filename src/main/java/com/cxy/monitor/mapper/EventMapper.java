package com.cxy.monitor.mapper;

import com.cxy.monitor.bean.Event;
import com.cxy.monitor.bean.SearchParams;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EventMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Event record);

    int insertSelective(Event record);

    Event selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Event record);

    int updateByPrimaryKey(Event record);

    List<Event> selectByParams(SearchParams params);
}