package com.yusuf.Sinav2;

import java.util.Comparator;

public class PointComparator implements Comparator<Point> {
    @Override
    public int compare(Point point1,Point point2){
        if(point1.getY()!=point2.getY()){
            return -(point1.getY()-point2.getY());
        }
        return -(point1.getX()-point2.getX());
    }

}
