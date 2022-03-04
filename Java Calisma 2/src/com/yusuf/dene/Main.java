package com.yusuf.dene;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
//        Hayvan hayvan=new At("coh hoj","4 tene doynak vardir","davudi");
//        if(hayvan instanceof Object){
//            System.out.println("dasdsds");
//        }
//        int a[] = {1,2,3,4,5,6,7};
//        int b[] = {1,2,3,4,5,6,7};
//        int c[] = {23,45,12,1,32,46,90};
//        Arrays.sort(c);
//        for(int h:c){
//            System.out.println(h);
//
//        }
//        if(a==b){
//            System.out.println("Eşitler");
//        }
//        if(Arrays.equals(a,b)){
//            System.out.println("Eşitler1");
////        }
//       String a1 = "Mustafa";
//
//       String a2 = "Mustafa";
//       String a3 = a1;
//       if(a1==a2){
//           System.out.println("esitler");
//       }

//        LinkedList<String> liste = new LinkedList<>();
//        liste.add("Zehra");
//        liste.add("Yusuf");
//        ListIterator<String> iterator = liste.listIterator(liste.size());
//        while(iterator.hasPrevious()){
//            System.out.println(iterator.previous());
//        }
String[] dizi1={"yufus","zehra","keyem"};
        Integer[] dizi2={1,54,78,12,2};
        Yazdirma<String> yazdirma=new Yazdirma<>();
        Yazdirma<Integer> yazdirma1=new Yazdirma<>();
        yazdirma.yazdirma(dizi1);
        yazdirma1.yazdirma(dizi2);






    }
}
