package com.yusuf.nyp4;

import java.io.IOException;

public class FerihaException extends IOException {
    public FerihaException(String mesaj){
        super(mesaj);
    }
    @Override
    public void printStackTrace(){
        System.out.println("yusuf ne dion? ");
    }
}
