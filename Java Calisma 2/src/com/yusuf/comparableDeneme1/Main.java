package com.yusuf.comparableDeneme1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Ogrenci> list=new ArrayList<>();
        list.add(new Ogrenci("yusuf","dagdeviren",500));
        list.add(new Ogrenci("zehra","cakir",400));
        list.add(new Ogrenci("ahmet","aslan",450));
        list.add(new Ogrenci("esra","karaman",550));

//        Collections.sort(list, new Comparator<Ogrenci>() {
//            @Override
//            public int compare(Ogrenci o1, Ogrenci o2) {
//                if(o1.getPuan()>o2.getPuan()){
//                    return -1;
//                }
//                if(o2.getPuan()>o1.getPuan()){
//                    return 1;
//                }
//                else
//                    return 0;
//            }
//        });
        Collections.sort(list,new OgrenciComparator());






        for (Ogrenci o: list){
            System.out.println(o);
        }

    }
}
