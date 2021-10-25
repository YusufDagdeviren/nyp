package com.yusuf.nyp4;









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
    
    
    public static void main(String[] args) {
        
        Circle[] circle = new Circle[5];
        
        
        
        
        for(int i = 0;i<circle.length;i++){
            
            circle[i] = new Circle();
            
        }
        
        for (Circle circle1: circle) {
            System.out.println(circle1.radius);
            
        }
        
        
        
    }
    
    
    
}