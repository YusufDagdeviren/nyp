package com.yusuf.nyp2;

public class Daire extends Sekil{
    private int yaricap;

    public Daire(int yaricap,String isim){
        super(isim);
        this.yaricap=yaricap;
    }

    @Override
    public void alanHesapla(){
        System.out.println(getIsim()+"nin alani "+Math.PI*yaricap*yaricap);
    }

}
