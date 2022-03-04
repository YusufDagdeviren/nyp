package com.yusuf.AbstractTekrar;

public class Fruit extends Hayvan implements Yenilebilir {
    public Fruit(String isim){
        super(isim);
    }
    @Override
    public String seslenme(){
        return getIsim()+" konusur";
    }
    @Override
    public String nasilYenir(){
        return "once bi yıka it";
    }

}
