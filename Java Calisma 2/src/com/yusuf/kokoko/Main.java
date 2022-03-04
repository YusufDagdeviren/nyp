package com.yusuf.kokoko;

public class Main {

    public static void fırlatma() throws YusufException{
        throw new YusufException("vırıvırvırıvırıvır");
    }



    public static void main(String[] args) {
        fırlatma();
    }
}
