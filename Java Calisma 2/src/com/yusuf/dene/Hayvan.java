package com.yusuf.dene;

public class Hayvan {
    public int ayakSayisi;
    public String isim;
    public String renk;
    public boolean gaga;
//public Hayvan(String isim){
//    this.isim=isim;
//}
    public Hayvan(){

    }

    public Hayvan(int ayakSayisi,String isim,String renk,boolean gaga){
        this.ayakSayisi=ayakSayisi;
        this.isim=isim;
        this.renk=renk;
        this.gaga=gaga;
    }

    public void seslenme(){
        System.out.println("Hayvan sesleniyor...");
    }
    public String ozellikler(){
        String ozellik="hayvanin ayak sayisi= "+ayakSayisi;
        return ozellik;
    }





}
