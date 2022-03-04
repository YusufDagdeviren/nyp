package com.yusuf.AbstractTekrar;

public class Main {
    public static void main(String[] args) {
        /*
        Yenilebilir adı altında bir adet interface oluşturun
        Bu interface içinde String dönderen Nasil yenir adında bir adet abstract metod tanımlayın
        Bir adet hayvan adında abstract sınıf oluşturun ve bu abstract sınıfta String dönen seslenme metodu tanımlayın
        bu interface'i ve abstract sınıfı implement ve extend eden fruit ve chicken sınıfları yazın ve metodları kendilerine göre
        override edin.
         */
        Chicken chicken=new Chicken("davuk");
        Fruit fruit=new Fruit("kiraz");
        System.out.println(chicken.nasilYenir());
        System.out.println(chicken.seslenme());
        System.out.println(fruit.nasilYenir());
        System.out.println(fruit.seslenme());


    }
}
