package com.yusuf.nyp5;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
class PlayerComparator implements Comparator<Player>{
    @Override
    public int compare(Player player1,Player player2){
        if(player1.getId()>player2.getId()){
            return -1;
        }
        else if(player1.getId()<player2.getId()){
            return 1;
        }
        else{
            return 0;
        }
    }
}
class Player implements Comparable<Player>{
   private String isim;
   private int id;
   public Player(String isim,int id){
       this.isim=isim;
       this.id=id;
   }
   public void setIsim(String isim){
       this.isim=isim;
   }
   public String getIsim(){
       return isim;
   }
   public void setId(int id){
       this.id=id;
   }
   public int getId(){
       return id;
   }
   @Override
    public int compareTo(Player player){
       if(this.id>player.id){
           return 1;
       }
       else if(this.id<player.id){
           return -1;
       }
       else{
           return 0;
       }
   }
   @Override
    public String toString(){
       return "oyuncunun ismi= "+getIsim()+" oyuncunu id si= "+getId();
   }
}



public class ComparableCalisma {


    public static void main(String[] args) {
    //Player player1=new Player("ahmet",10);
    //Player player2=new Player("ali",20);
   // System.out.println(player1.compareTo(player2));
    LinkedList<Player> playlist=new LinkedList<>();
    playlist.add(new Player("yusuf",12));
    playlist.add(new Player("zehra",5));
    playlist.add(new Player("atakan",8));
    playlist.add(new Player("ozcan",21));
        Collections.sort(playlist,new PlayerComparator());
        for(Player p:playlist){
            System.out.println(p);
        }






    }


}
