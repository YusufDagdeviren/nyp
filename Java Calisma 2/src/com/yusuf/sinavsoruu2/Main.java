package com.yusuf.sinavsoruu2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Point[] points=new Point[100];
        for(int i=0;i<points.length;i++){
            points[i]=new Point((double)Math.random()*5,(double)Math.random()*5);

        }
        Arrays.sort(points);
        List<Point> list=Arrays.asList(points);
        System.out.println(list);

        Arrays.sort(points,new PointComparator());
        List<Point> list2=Arrays.asList(points);
        System.out.println(list2);


    }
}
