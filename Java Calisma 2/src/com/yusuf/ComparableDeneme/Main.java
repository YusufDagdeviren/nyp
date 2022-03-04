package com.yusuf.ComparableDeneme;

import java.util.*;

class Dikdortgen implements Comparable<Dikdortgen> {
    private double width;
    private double height;
    public Dikdortgen(){

    }
    @Override
    public int compareTo(Dikdortgen d){
        if(alan()>d.alan()) {
          return 1;
        }
        else if(alan()<d.alan()){
            return -1;
        }
        else{
            return 0;
        }
    }
    public Dikdortgen(double width,double height){
        this.width=width;
        this.height=height;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getWidth(){
        return width;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getHeight(){
        return height;
    }
    public double alan(){
        return height*width;
    }

    @Override
    public String toString() {
        return "Alan = "+alan();
    }
}
class CompareDikdortgen implements Comparator<Dikdortgen>{
    public CompareDikdortgen(){

    }
    @Override
    public int compare(Dikdortgen d1,Dikdortgen d2){
        if(d1.alan()>d2.alan()){
            return 1;
        }
        else if(d1.alan()<d2.alan()){
            return -1;
        }
        else{
            return 0;
        }

    }

}

public class Main {
    public static void main(String[] args) {
        /*Bir adet dikdörtgen sınıfı yazın içinde width ve height değerleri olsun ve main içinde bu sınıftan 50 adet obje listesi
        üretin bunları alanlarına göre sıralayın ve ekrana  sırasıyla basın.*/
        /*
        Bir adet CompareDikdortgen sınıfı yazınız bu sınıfta dikdörtgen alanları karşılaştırınız
         */
        ArrayList<Dikdortgen> dikdortgens=new ArrayList<>();
        Random rnd=new Random();
        for(int i=0;i<50;i++){
            dikdortgens.add(new Dikdortgen(rnd.nextDouble(),rnd.nextDouble()));
        }
        Collections.sort(dikdortgens,new CompareDikdortgen());
        for(Dikdortgen d:dikdortgens){
            System.out.println(d);
        }



        }
    }
