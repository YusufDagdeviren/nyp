package com.yusuf.Clonelama;

public class Main {
    public static void main(String[] args) {
        int[] dizi={100,85,74};
        Ogrenci ogrenci1=new Ogrenci("zehra",87,dizi);
        try {
            Ogrenci ogrenci2=(Ogrenci) ogrenci1.clone();
            if(ogrenci1.getNotlar()==ogrenci2.getNotlar()){
                System.out.println("shallow copy");
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
