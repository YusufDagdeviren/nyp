package com.yusuf.nyp2;

public abstract class Sekil {
    private String isim;

    public Sekil(String isim){
        this.isim=isim;
    }

    public void isminiSoyle(){
        System.out.println("bu seklin ismi "+isim+"dir.");
    }
    public abstract void alanHesapla();
    public void setIsim(String isim){
        this.isim=isim;
    }
    public String getIsim(){
        return isim;
    }
    public void cevreHesapla(){
        System.out.println(getIsim()+"nin cevresi "+4+" dir");
    }
}
