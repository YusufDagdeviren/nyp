package com.yusuf.comparableDeneme1;

import java.util.Comparator;

public class OgrenciComparator implements Comparator<Ogrenci> {
    @Override
    public int compare(Ogrenci ogrenci,Ogrenci ogrenci2){
        if(ogrenci.getPuan()>ogrenci2.getPuan()){
            return -1;
        }
        else if(ogrenci.getPuan()<ogrenci2.getPuan()){
            return 1;
        }
        else{
            return 0;
        }

    }

}
