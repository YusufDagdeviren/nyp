package com.yusuf.nyp2;

public class Kare extends Sekil{
    private int kenar;
    public Kare(int kenar,String isim){
        super(isim);
        this.kenar=kenar;
    }
    @Override //zorunlu override edilmesi gereken metod
    public void alanHesapla(){
        System.out.println(getIsim()+"nin alani "+kenar*kenar+"dir ");
    }
    @Override
    public void cevreHesapla(){
        System.out.println(getIsim()+"nin cevresi "+4*kenar+" dir");
    }


}
