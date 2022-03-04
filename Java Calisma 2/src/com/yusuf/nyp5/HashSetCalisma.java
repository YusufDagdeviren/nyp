package com.yusuf.nyp5;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetCalisma {
    public static void main(String[] args) {
        /*Set<String> set1=new HashSet<>();
        Set<String> set2=new LinkedHashSet<>();
        Set<String> set3=new TreeSet<>();

        set1.add("Java");
        set1.add("Python");
        set1.add("C++");
        set1.add("javascript");
        set1.add("php");

        set2.add("Java");
        set2.add("Python");
        set2.add("C++");
        set2.add("javascript");
        set2.add("php");

        set3.add("Java");
        set3.add("Python");
        set3.add("C++");
        set3.add("javascript");
        set3.add("php");
        set3.add("php");*/


        /*System.out.println("****bu hashsettir****");
        for(String s1:set1){
            System.out.println(s1);
        }
        System.out.println("****bu LinkedHashSet****");
        for(String s2:set2){
            System.out.println(s2);
        }*/
        /*System.out.println("*****bu Treesettir*****");
        for(String s3:set3){
            System.out.println(s3);
        }*/

//        System.out.println(set3.contains("go"));

        Set<String> set1=new HashSet<>();
        Set<String> set2=new HashSet<>();
        set1.add("java");
        set1.add("c++");
        set1.add("python");
        set1.add("javascript");
        set1.add("php");

        set2.add("go");
        set2.add("java");
        set2.add("css");

        Set<String> fark=new HashSet<>(set2);
        System.out.println(fark.removeAll(set1));
        System.out.println(fark);

        Set<String> kesisim=new HashSet<>(set2);
        System.out.println(kesisim.retainAll(set1));
        System.out.println(kesisim);





    }
}
