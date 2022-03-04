package com.yusuf.nyp1;

import java.util.Scanner;

public class Tavuk implements Hayvan,Kosma{
    private String isim;
    private int ayakSayisi;
    private String renk;
    private int yas;

    public Tavuk(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("İsmi gir");
        isim = scanner.nextLine();
        System.out.println("ayakSayisi gir");
        ayakSayisi = scanner.nextInt();

    }
    public Tavuk(String isim){
        this.isim = isim;
    }
    @Override
    public void nasilYenir(){
        System.out.println("kizartilarak yenir");
    }
    @Override
    public void ayakSayisi(){
        System.out.println("tavugun ayak sayisi: "+this.ayakSayisi);
    }
    @Override
    public int hiz(int hiz){
        return hiz*ayakSayisi;
    }

}
