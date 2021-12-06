package com.yusuf.nyp;

public class Main {

    public static void main(String[] args) {


        Object[] o = {new Tiger(),new Chicken(),new Apple()};

        for(int i=0;i<o.length;i++){
            if(o[i] instanceof Edible){
                System.out.println(((Edible) o[i]).howToEat());
            }
            if(o[i] instanceof Animal){
                System.out.println(((Animal) o[i]).sound());
            }
        }





    }
}
