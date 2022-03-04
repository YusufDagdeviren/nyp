package com.yusuf.Sinav2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd=new Random();
        LinkedList<Point> listt=new LinkedList<>();

        for(int i=0;i<50;i++){
            listt.add(new Point(rnd.nextInt(50),rnd.nextInt(50)));
        }
        Collections.sort(listt);
        for(Point p:listt){
            System.out.println(p);
        }
    }
}
