package com.yusuf.sinavsoruu2;

public class Point implements Comparable<Point>{
    private double x;
    private double y;

    public Point(double x,double y){
        this.x=x;
        this.y=y;
    }
    public void setX(double x){
        this.x=x;
    }
    public double getX(){
        return x;
    }
    public void setY(double y){
        this.y=y;
    }
    public double getY(){
        return y;
    }
    @Override
    public int compareTo(Point point){
        if(getX()==point.getX()){
            if(getY()>point.getY()){
                return 1;
            }
            else if(getY()<point.getY()){
                return -1;
            }
            else{
                return 0;
            }
        }
        if(getX()>point.getX()){
            return 1;

        }
        else{
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
