package com.yusuf.nyp2;

public class Circle implements Comparable<Circle>,Cloneable{


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
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        Circle circle =(Circle) obj;
       return this.radius == ((Circle) obj).getRadius();
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
