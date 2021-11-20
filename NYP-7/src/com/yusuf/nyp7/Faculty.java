
package com.yusuf.nyp7;

class Person{

    public Person() {
        System.out.println("(1) Person sınıfının constructor ı çağrıldı");
    }
    
    
    
    
}
class Employee extends Person{

    public Employee() {
        this("(2) Employe un overload constructor ı çağrıldı");
        System.out.println("(3) Employe un boş constructor u çağrıldı");
    }
    public Employee(String s) {
        System.out.println(s);
    }
    
    
}

public class Faculty extends Employee {
    
    public static void main(String[] args) {
        new Faculty();
    }
    public Faculty(){
        System.out.println("(4) Faculty sınıfının constructor u çağrıldı");
    }
    
    /*
    Constructor chaning de subclass constructorunda super() ifadesi olmasa bile varmış gibi davranır ve superclassının boş constructoruna gider
    */
    
    
}
