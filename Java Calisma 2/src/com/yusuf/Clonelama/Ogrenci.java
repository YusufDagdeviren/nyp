package com.yusuf.Clonelama;

import java.io.Serializable;

public class Ogrenci implements Cloneable, Serializable {
    private String isim;
    private int ogrNo;
    private int[] notlar;

    public Ogrenci(){}
    public Ogrenci(String isim,int ogrNo,int[] notlar){
        this.isim=isim;
        this.ogrNo=ogrNo;
        this.notlar=notlar;
    }
    public void setIsim(String isim){
        this.isim=isim;
    }
    public String getIsim(){
        return isim;
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
    @Override
    public Object clone() throws CloneNotSupportedException{
        Ogrenci ogrenci=(Ogrenci) super.clone();

        int[] not=new int[getNotlar().length];
        for(int i=0;i<getNotlar().length;i++){
            not[i]=getNotlar()[i];
        }
        ogrenci.setNotlar(not);
        String ad=new String(getIsim());
        ogrenci.setIsim(ad);
        return ogrenci;
    }


}
