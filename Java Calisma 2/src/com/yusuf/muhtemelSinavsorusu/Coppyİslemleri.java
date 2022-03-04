package com.yusuf.muhtemelSinavsorusu;

import java.io.Serializable;

class Ogrenci implements Cloneable, Serializable {
    private int ogrNo; //Primitive (Dümdüz)
    private int[] notlar;//Non primitive(Referans mantığı)
    private String isim;// Non Primitive(Referans mantığı)

    public Ogrenci(){

    }

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
        Ogrenci ogr1=(Ogrenci)super.clone();

        String str=new String(getIsim());
        ogr1.setIsim(str);
        int[] dizi=new int[getNotlar().length];
     for(int i=0;i<dizi.length;i++){
           dizi[i] = this.notlar[i];
       }
        ogr1.setNotlar(dizi);

        return ogr1;
//
//
//

//        ogr1.setIsim(str);

    }

}



public class Coppyİslemleri {
    public static void main(String[] args) throws CloneNotSupportedException {
        int[] notlar = {50,75,20};
        Ogrenci ogrenci=new Ogrenci(12,notlar,"ahmet");

            Ogrenci ogrenci2 = (Ogrenci) ogrenci.clone();

        if(ogrenci.getIsim()==ogrenci2.getIsim()){
            System.out.println("shallow copy");
        }
        if(ogrenci.getNotlar()==ogrenci2.getNotlar()){
            System.out.println("shalloww copy");
        }



    }


}
