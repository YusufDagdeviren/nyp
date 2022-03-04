package com.yusuf.AbstractTekrar;

public abstract class Hayvan {
    private String isim;
    public Hayvan(String isim){
        this.isim=isim;
    }
    public void setIsim(String isim){
        this.isim=isim;
    }
    public String getIsim(){
        return isim;
    }
    public abstract String seslenme ();


}
