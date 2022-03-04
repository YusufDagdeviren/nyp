package com.yusuf.comparableDeneme1;

public class Ogrenci implements Comparable<Ogrenci>  {
    private String isim;
    private String soyisim;
    private int puan;


    public Ogrenci(){}

    public Ogrenci(String isim,String soyisim,int puan){
        this.isim=isim;
        this.soyisim=soyisim;
        this.puan=puan;
    }

    @Override
    public int compareTo(Ogrenci ogrenci){
        if(this.puan>ogrenci.puan){
            return -1;
        }
        else if(this.puan<ogrenci.puan){
            return 1;
        }
        else {
            return 0;
        }
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getPuan() {
        return puan;
    }

    public void setPuan(int puan) {
        this.puan = puan;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", puan=" + puan +
                '}';
    }
}
