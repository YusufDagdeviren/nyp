package com.yusuf.nyp4;

public class Zehra extends ArithmeticException{
    public Zehra(String s) {
        super(s);
    }

    public Zehra() {
    }

    @Override
    public void printStackTrace() {
        System.out.println("Zehra sana sinirli");
    }
}
