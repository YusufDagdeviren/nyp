/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yusuf.nyp4;

/**
 *
 * @author yusuf
 */
public class Main {
    
    
    
    public static void degistir(int a,int b)
    {
        a = 8;
        b = 4;
        
        
        
    }
    public static void degistir(Circle a)
    {
      
      a.radius = 10;  
        
    }
    
    /*
    pass by value
    pass by reference
    */
    
    
    public static void main(String[] args) {
        
       /* int a = 1;
        int b = 2;
        
        System.out.println("Metod çağırılmadan önce");
        System.out.println("a:"+a+" b=" +b);
        degistir(a, b);
        System.out.println("Metod çağırıldıktan sonra ");
        System.out.println("a:"+a+" b=" +b);
        */
       
       
       
       /*Circle circle = new Circle();
       circle.radius = 0;
       System.out.println("Metod çağırılmadan önce");
        System.out.println(circle.radius);
        degistir(circle);
        System.out.println("Metod çağırıldıktan sonra ");
        System.out.println(circle.radius);*/
       
       
       Bmi bmi = new Bmi(19,49,1.68);
        System.out.println(bmi.getStatus());
       
    }
}
