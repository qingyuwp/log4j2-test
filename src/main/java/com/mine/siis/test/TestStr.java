package com.mine.siis.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executors;

public class TestStr {
    public static void main(String[] args) {
        String a = "abcd";
        String b = "abcd";
        System.out.println(a == b);
        String c = new String("abcd");
        String d = new String("abcd");
        System.out.println(c == d);
        System.out.println(c.equals(d));
        System.out.println(a == c);
        System.out.println(a.equals(c));






        Map<String,String> map = new HashMap<>();
        map.put("aa","aa");
        map.put("bb","bb");
        for (String key: map.keySet()) {
            System.out.println(key + " : " +map.get(key));
        }
        Iterator<Map.Entry<String,String>>  iterator =  map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> entry =  iterator.next();
            System.out.println(entry.getKey() + " ===== " + entry.getValue());
        }
        for (String value:map.values()) {
            System.out.println(value);
        }
        map.forEach((key,value)->{
            System.out.println(key + " --- " + value);
        });

    }
}
