package com.yusuf.nyp1;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
public static void bastir(LinkedList<String> sehirler){
    /*for(String s:sehirler){
        System.out.println(s);
    }*/
    ListIterator<String> iterator=sehirler.listIterator(sehirler.size());
    while (iterator.hasPrevious()){
        System.out.println(iterator.previous());
    }

}
public static void sirala(LinkedList<String> sehirler,String data){
    ListIterator<String> iterator = sehirler.listIterator();
    while (iterator.hasNext()){
        int karsilastir = iterator.next().compareTo(data);

        if(karsilastir==0){
            System.out.println("Zaten listede "+data+" var");
            return;
        }else if(karsilastir<0){
            iterator.previous();
            iterator.add(data);
            return;
        }else{

        }


    }
    iterator.add(data);



}




    public static void main(String[] args) {
        /*LinkedList<String> sehirler=new LinkedList<>();
        sirala(sehirler,"Ankara");
        sirala(sehirler,"Corum");
        sirala(sehirler,"Zonguldak");
        sirala(sehirler,"Antalya");



        bastir(sehirler);*/
        Tavuk tavuk=new Tavuk("Davut");

        tavuk.nasilYenir();
        tavuk.ayakSayisi();
        System.out.println(tavuk.hiz(12));
        Inek inek=new Inek("inek",4,"siyah",7);
        inek.ayakSayisi();
        inek.nasilYenir();
        System.out.println(inek.hiz(5));







    }
}
