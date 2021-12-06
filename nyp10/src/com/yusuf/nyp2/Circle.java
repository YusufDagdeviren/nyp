package com.yusuf.nyp2;

public class Circle implements Comparable<Circle>{


    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){

        return Math.PI * Math.pow(radius,2);
    }

    public double getPerimeter(){
        return 2*Math.PI*radius;
    }




    @Override
    public int compareTo(Circle o) {
        if(getArea()>o.getArea()){
            return 1;
        }

        else if(getArea()==o.getArea()){
            return 0;
        }
        else{
            return -1;
        }

    }





}
