package com.mine.siis.test;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        String str1 = "key";
        String str2 = "key";
        System.out.println(str1 == str2);
        Map<String,String> map = new HashMap<>();
        map.put(str1,"value1");
        map.put(str2,"value2");
        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
        System.out.println("containsKey---->"+map.get("key"));


    }
}
