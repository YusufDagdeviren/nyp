package com.yusuf.GenericMetodTekrar;

public class Main {
    public static void main(String[] args) {
        /*
        Mainde İçinde integer değerler barındıran bir dizi ve içinde String değerler içeren bir dizi tanımlayın(Değerlerini hazır girin)
        Bu iki dizinin ortak olarak çalıştığı bir generic metodda bu dizileri bastırın.
         */
    Integer[] dizi1={1,2,3,4,5};
    String[] dizi2={"yusuf","zehra","mamut"};
    bastir(dizi1);
    bastir(dizi2);






    }
    public static <E> void bastir(E[] dizi){
        for(E e:dizi){
            System.out.println(e);
        }



    }



}
