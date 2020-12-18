package com.yue.first.util;

import java.util.HashMap;
import java.util.Map;

public class Moniter {
    private static Map<String, Long> counter = new HashMap<>();
    private static Map<String, Long> duration = new HashMap<>();
    public static void count(String name){
        Long count = counter.get(name);
        if(count == null){
            counter.put(name, (long) 1);
            return;
        }
        counter.put(name, count++);
    }
    public static void duration(String name, long microSecond){
        Long time = duration.get(name);
        if(time == null){
            duration.put(name, (long) microSecond);
            return;
        }
        duration.put(name, (long) (microSecond + time) / counter.get(name));
    }
}
