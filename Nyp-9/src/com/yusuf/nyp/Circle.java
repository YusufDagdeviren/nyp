package com.yusuf.nyp;

public class Circle extends GeometricObject{

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        //super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter(){

        return 2*this.radius;

    }
    public void printCircle(){

        System.out.println(this.radius+" yarıçaplı dairenin özellikleri: "+ super.toString());

    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * this.radius;
    }

}























