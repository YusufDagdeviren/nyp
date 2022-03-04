package com.yusuf.nyp2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*Kare kare=new Kare(5,"kare");
        Daire daire=new Daire(4,"daire");
        kare.alanHesapla();
        kare.cevreHesapla();
        daire.alanHesapla();
        kare.isminiSoyle();
        daire.isminiSoyle();
        */
        Sekil daire=new Daire(2,"daire");
        Sekil kare=new Kare(3,"kare");
        kare.alanHesapla();
        kare.cevreHesapla();
        daire.alanHesapla();
        daire.isminiSoyle();
        kare.isminiSoyle();





    }
}
