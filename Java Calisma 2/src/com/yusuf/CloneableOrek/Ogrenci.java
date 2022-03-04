package com.yusuf.CloneableOrek;

import java.io.Serializable;

public class Ogrenci implements Cloneable, Serializable {
    private int ogrNo;
    private int[] notlar;
    private String isim;

    public Ogrenci(){}

    public Ogrenci(int ogrNo,int[] notlar,String isim){
        this.ogrNo=ogrNo;
        this.notlar=notlar;
        this.isim=isim;
    }

    public void setOgrNo(int ogrNo){
        this.ogrNo=ogrNo;
    }
    public int getOgrNo(){
        return ogrNo;
    }
    public void setNotlar(int[] notlar){
        this.notlar=notlar;
    }
    public int[] getNotlar(){
        return notlar;
    }
    public void setIsim(String isim){
        this.isim=isim;
    }
    public String getIsim(){
        return isim;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        Ogrenci ogrenci=(Ogrenci) super.clone();

        int[] dizi= new int[getNotlar().length];
        String str=new String(getIsim());

        for(int i=0;i<dizi.length;i++){
            dizi[i]=this.notlar[i];
        }
        ogrenci.setNotlar(dizi);
        ogrenci.setIsim(str);

        return ogrenci;//shallow
    }

}
