package com.yusuf.nyp3;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*Character[] array={'J','A','V','A'};
        Integer[] array1={1,2,3,4,5,6};
        String[] array2={"java","pyhton","c++","php"};
        Ogrenci[] array4={new Ogrenci("mustafa"),new Ogrenci("yusuf"),new Ogrenci("zeo")};*/
        /*Yazdirma<Character> yazdirma=new Yazdirma<>();
        Yazdirma<Integer> yazdirma1=new Yazdirma<>();
        Yazdirma<String> yazdirma2=new Yazdirma<>();
        Yazdirma<Ogrenci> yazdirma3=new Yazdirma<>();
        yazdirma.yazdir(array);
        yazdirma1.yazdir(array1);
        yazdirma2.yazdir(array2);
        yazdirma3.yazdir(array4);*/
        /*yazdir(array);
        yazdir(array1);
        yazdir(array2);
        yazdir(array4);*/
        /*Sayisal sayisal1=new Sayisal(30,40,20,30);
        Sayisal sayisal2=new Sayisal(25,45,2,35);
        EsitAgirlik esitAgirlik1=new EsitAgirlik(30,20,40,2);
        EsitAgirlik esitAgirlik=new EsitAgirlik(40,10,50,0);
        Sayisal birinci=birinci(sayisal1,sayisal2);
        EsitAgirlik birinci1=birinci(esitAgirlik,esitAgirlik1);
        System.out.println("sayisalda birinci olanin matematik neti "+birinci.getMatematik());
        System.out.println("esitagirlikta birinci olanin edebiyat neti "+birinci1.getEdebiyat());*/
        String[] dizi1={"yufus","zehra","keyem"};
        Integer[] dizi2={1,54,78,12,2};
        yazdir(dizi1);
        yazdir(dizi2);


    }
    public static <E extends Aday> E birinci(E e1,E e2){
        if(e1.puanHesapla()>e2.puanHesapla()){
            return e1;
        }
        else{
            return e2;
        }
    }

    public static <E> void yazdir(E[] dizi){
        for (E e:dizi){
            System.out.println(e);
        }
    }





}
