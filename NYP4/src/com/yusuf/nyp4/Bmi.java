/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yusuf.nyp4;

/**
 *
 * @author yusuf
 */
public class Bmi {
    
    private String name;
    private int age;
    private double weight; 
    private double height;

    
    /*
    ağırlık / boy^2
    
    */
    public Bmi(int age, double weight, double height) {
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public Bmi(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }
    
    public double getBmi(){
        
        return weight / Math.pow(height,2);
        
        
    }
    public String getStatus(){
        if(getBmi()<18.49){
            return "Çok zayıf";
        }
        else if(18.49<getBmi() && getBmi()<24.99){
            return "İdeal";
        }
        else if(25<getBmi() && getBmi()<29.99){
            return "Kilolu";
        }
        else if(getBmi()>30){
            return "Aşrırı kilolu";
        }
    }
    
}
