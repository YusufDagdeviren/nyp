package com.yusuf.muhtemelSinavsorusu;

import java.io.Serializable;
import java.util.ArrayList;

class Mahmut implements Cloneable, Serializable {
    private double boy;
    private String sacRengi;
    private ArrayList<Integer> not=new ArrayList<>();
    private int kilo;

    public  Mahmut(){

    }
    public Mahmut(double boy,String sacRengi,ArrayList<Integer> not,int kilo){
        this.boy=boy;
        this.sacRengi=sacRengi;
        this.not=not;
        this.kilo=kilo;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        Mahmut mahmut=(Mahmut) super.clone();
        ArrayList<Integer> not1=new ArrayList<>(getNot());
        mahmut.setNot(not1);
        String str=new String(getSacRengi());
        mahmut.setSacRengi(str);
        return mahmut;//mamut shallow

    }



    public void setBoy(double boy){
        this.boy=boy;
    }
    public double getBoy(){
        return boy;
    }
    public void setSacRengi(String sacRengi){
        this.sacRengi=sacRengi;
    }
    public String getSacRengi(){
        return sacRengi;
    }
    public void setNot(ArrayList<Integer> not){
        this.not=not;
    }
    public ArrayList<Integer> getNot(){
        return not;
    }
    public void setKilo(int kilo){
        this.kilo=kilo;
    }
    public int getKilo(){
        return kilo;
    }










    }
public class Main {
    public static void main (String[] args) throws CloneNotSupportedException{
        ArrayList<Integer> not=new ArrayList<>();
        not.add(85);
        not.add(40);
        Mahmut mahmut=new Mahmut(1.60,"sari",not,75);
        Mahmut mahmut2=(Mahmut) mahmut.clone();

        if(mahmut.getSacRengi()==mahmut2.getSacRengi()){
            System.out.println("mamut shallow");
        }
        if(mahmut.getNot()==mahmut2.getNot()){
             System.out.println("mamut shallow 2");
        }
        if(mahmut.getBoy()==mahmut2.getBoy()){
            System.out.println("mamut copy 3 primitive");
        }
        if(mahmut.getKilo()==mahmut2.getKilo()){
            System.out.println("mamut copy 4 primitive");
        }





    }
}
