package com.yusuf.dene;

public class At extends Hayvan{
    public String yele;
    public String toynak;

    @Override
    public void seslenme(){
        System.out.println(isim+" kisner.");
    }
    public At(String yele,String toynak,String isim){
        super.isim=isim;
        this.yele=yele;
        this.toynak=toynak;
    }
    @Override
    public String ozellikler(){
        String ozellikler=super.ozellikler()+"\nyelesi sudur "+yele+"\ntoynaki sudur"+toynak;
        return ozellikler;
    }

}
