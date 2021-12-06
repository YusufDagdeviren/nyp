package com.yusuf.nyp;

public class Chicken implements Edible{
    @Override
    public String howToEat() {
        return "Fry it";
    }
    public String sound(){
        return "cock-a-doodle-doo";
    }
}
