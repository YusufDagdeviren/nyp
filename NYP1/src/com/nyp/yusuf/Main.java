package com.nyp.yusuf;

import java.awt.Robot;







class Circle{
    
    public double radius;
    public static int numberOfObject = 0;
    
    public Circle(double newRadius) {
        numberOfObject++;
        this.radius = newRadius;
    }

    public static int getNumberOfObject() {
        return numberOfObject;
    }

    public Circle() {
        numberOfObject++;
    }
    
    public double getArea(){
        
        
        return Math.PI * radius*radius;
        
    }
    
    public double getPerimeter(){
       
        
        return Math.PI *2 *radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    
    
    
}













public class Main {
    
    
    public static void main(String[] args) {
        
      /* Circle circle = new Circle();
       Circle circle1 = new Circle(5.0);
       System.out.println(circle.radius);
       System.out.println(circle1.radius);
       System.out.println(circle.numberOfObject);//Ulaşılması önerilmiyor 
       System.out.println(Circle.numberOfObject);
       */
      
      
     
                
        
    }

    
    

    
}
