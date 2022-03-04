package com.yusuf.sinavSorusu;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

class PointComparator implements Comparator<Point>{
    @Override
    public int compare(Point p1,Point p2){
        if(p1.getY()>p2.getY()){
            return 1;
        }
        else if(p1.getY()<p2.getY()){
            return -1;
        }
        else {
            if(p1.getX()>p2.getX()){
                return 1;
            }
            else if(p1.getX()<p2.getX()){
                return -1;
            }
            else{
                return 0;
            }
        }

    }
}
class Point implements Comparable<Point>{
    private double x;
    private double y;

    public Point(){

    }

    public Point(double x,double y){
        this.x=x;
        this.y=y;
    }

    public void setX(double x){
        this.x=x;
    }
    public double getX(){
        return x;
    }
    public void setY(double Y){
        this.y=y;
    }
    public double getY(){
        return y;
    }
    @Override
    public int compareTo(Point p){
        if(getX()>p.getX()){
            return 1;
        }
        else if(getX()<p.getX()){
            return -1;
        }
        else{
            if(getY()>p.getY()){
                return 1;
            }
            else if(getY()<p.getY()){
                return -1;
            }
            else{
                return 0;
            }
        }



    }

    @Override
    public String toString() {
        return "X in degeri: "+this.x+" Y nin degeri: "+this.y;
    }
}






public class SinavSorusu {

    public static void main(String[] args) {
        /*
       1-) içinde x ve y(double) kordinat değerlerini tutan bir Point sınıfı yazınız bu sınıf compareTo metodunu içersin
       öncelikli olarak x kordinatı karşılaştırılsın aynı ise y kordinatları karşılaştırılsın
       2-) compare metodunu içeren PointComparator sınıfını yazınız öncelikli olara y kordinatları karşılaştırılsın
       eşit ise x kordinatları karşılaştırılsın
       3-) 50 adet rastgele değer içeren point sınıfını Collection.sort metodu ile karsilastırınız
         */
        ArrayList<Point> points=new ArrayList<>();
        Random rnd = new Random();
        for(int i=0;i<50;i++){
            points.add(new Point(rnd.nextInt(50),rnd.nextInt(50)));
        }
        Collections.sort(points);
        for(Point p:points){
            System.out.println(p);
        }



    }



}
