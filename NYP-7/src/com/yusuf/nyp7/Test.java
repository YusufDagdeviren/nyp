
package com.yusuf.nyp7;

public class Test {
    public static void main(String[] args) {
         B b = new B();
        A a = new A();
        b.p(5);
        a.p(5);
    
    }
}
class B{
    public void p(double i){
        System.out.println(i * 2);
    }
    
}
class A extends B{

    @Override
    public void p(double i) {
         System.out.println(i);
    }

   
}