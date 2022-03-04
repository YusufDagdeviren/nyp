package com.yusuf.nyp1;

public class Inek implements Hayvan,Kosma{
    private String isim;
    private int ayakSayisi;
    private String renk;
    private int yas;

    public Inek(String isim,int ayakSayisi,String renk,int yas){
        this.isim=isim;
        this.ayakSayisi=ayakSayisi;
        this.renk=renk;
        this.yas=yas;
    }
    @Override
    public void nasilYenir(){
        System.out.println("kavurularak yenir.");
    }
    @Override
    public void ayakSayisi(){
        System.out.println("inegin ayak sayisi "+this.ayakSayisi);
    }
    @Override
    public int hiz(int hiz){
        return hiz*ayakSayisi;
    }






}
