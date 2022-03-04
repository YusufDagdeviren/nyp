package com.yusuf.Sinav2;

public class Point implements Comparable<Point>{
    private int x;
    private int y;

    public Point(){}

    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    public void setX(int x){
        this.x=x;
    }
    public int getX(){
        return x;
    }
    public void setY(int y){
        this.y=y;
    }
    public int getY(){
        return y;
    }

    @Override
    public int compareTo(Point point){
        if(this.x!=point.x){
            return this.x-point.x;
        }
        return this.y - point.y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
