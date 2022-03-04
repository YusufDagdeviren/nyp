package com.yusuf.AbstractTekrar;

public class Chicken extends Hayvan implements Yenilebilir{
    public Chicken(String isim){
        super(isim);
    }
    public String nasilYenir(){
        return "hasla";
    }
    public String seslenme(){
        return getIsim()+" seslenir.";
    }


}
