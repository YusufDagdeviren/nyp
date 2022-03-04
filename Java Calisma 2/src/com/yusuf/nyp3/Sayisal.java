package com.yusuf.nyp3;

public class Sayisal extends Aday {
    public Sayisal(int turkce,int matematik,int edebiyat,int fizik){
        super(turkce,matematik,edebiyat,fizik);

    }
    @Override
    public int puanHesapla(){
        return getTurkce()*5+getMatematik()*5+getFizik()*5+getEdebiyat()*1;
    }

}
