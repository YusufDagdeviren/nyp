package com.yusuf.nyp5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapCalisma {
    public static void mapYazdir(Map<Integer,String> map){
        map.put(10,"C++");
        map.put(5,"Java");
        map.put(1,"Python");
        map.put(2,"Php");
        map.put(100,"C");

        for(Integer key:map.keySet()){
            System.out.println("Key: "+key+"----> "+map.get(key));
        }
    }

    public static void main(String[] args) {
        Map<Integer,String> hashMap=new HashMap<>();
        Map<Integer,String> linkHashMap=new LinkedHashMap<>();
        Map<Integer,String> treeMap=new TreeMap<>();

        System.out.println("----------------------------");
        mapYazdir(hashMap);

        System.out.println("-----------------------------");
        mapYazdir(linkHashMap);


        System.out.println("------------------------------");
        mapYazdir(treeMap);

    }
}
