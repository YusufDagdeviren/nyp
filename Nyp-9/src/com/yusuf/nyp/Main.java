package com.yusuf.nyp;

public class Main {


    public static void displayGeometricObject(GeometricObject object){
        System.out.println();
        System.out.println("The area is "+object.getArea());
        System.out.println("The perimeter is "+ object.getPerimeter());
    }
    public static boolean equalAre(GeometricObject object,GeometricObject object2){
        return object.getArea()==object2.getArea();

    }



    public static void main(String[] args) {

    GeometricObject geometricObject1 = new Circle(5);
    GeometricObject geometricObject = new Rectangle(5,3);
        System.out.println("The two objects have two same area ? "+equalAre(geometricObject,geometricObject1));
    displayGeometricObject(geometricObject);
    displayGeometricObject(geometricObject1);



    }
}
