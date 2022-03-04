package com.yusuf.kokoko;

import java.io.IOException;

public class YusufException extends RuntimeException {
    public YusufException(String mesaj){
        super(mesaj);
    }

    @Override
    public void printStackTrace(){
        System.out.println("yusufun hatasi");
    }
}
