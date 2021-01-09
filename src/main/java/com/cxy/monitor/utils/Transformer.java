package com.cxy.monitor.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Transformer {

    // hashmap转list
    public static <T> List<T> map2list(Map<String, T> map) {
        ArrayList<T> list = new ArrayList<>();
        for (String key: map.keySet()) {
            list.add(map.get(key));
        }
        return list;
    }
}
