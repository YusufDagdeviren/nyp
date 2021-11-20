
package com.yusuf.nyp7;


public class Main {
    public static void main(String[] args) {
        
        Circle circle = new Circle(5);
        System.out.println("Çemberin rengi: "+circle.getColor());
        System.out.println("Cemberin doluluğu: "+circle.isFilled());
        System.out.println("Cemberin yarıçapı: "+circle.getRadius());
        System.out.println("Cemberin alanı: "+circle.getArea());
        System.out.println("Cemberin çevresi: "+circle.getPerimeter());
        System.out.println("Cemberin çapı: "+circle.getDiameter());
        
        
        circle.printCircle();
        
       /* Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Dikdörtgenin Alanı : "+rectangle.getArea());
        System.out.println("Dikdörtgenin Çevresi : "+rectangle.getPerimeter());
        System.out.println("Dikdörtgenin Rengi : "+rectangle.getColor());
        System.out.println(rectangle.toString());
        */
        
        
    }
}
