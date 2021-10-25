/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nyp.yusuf;

/**
 *
 * @author yusuf
 */
public class Tv {
    
    public int channel;
    public int volumelevel;
    public boolean on;

    public Tv() {
        this.channel = -1;
        this.volumelevel = -1;
        on = false;
    }
    
    public  void turnOn(){
        
        this.on = true;
        
        
    }
    
    public void turnOff(){
        
        this.on = false;
        
        
    }
    public void setChannel(int newChannel){
        
        if(on && newChannel >=1 && newChannel <=128){
            this.channel = newChannel; 
        }else{
            
            System.out.println("Kanal değiştirilemedi");
            
        }
        
       
        
        
    }
    public void setVolume(int newVolumeLevel){
        if(on && newVolumeLevel >=1 && newVolumeLevel <=18){
            this.volumelevel = newVolumeLevel; 
        }else{
            System.out.println("Ses değiştilmedi");
        }
        

        
        
        
    }
    public void channelUp(){
        if(channel >=1 && channel <=128){
            this.channel++;
        
        }
        
    }
    public void channelDown(){
        if(channel >=1 && channel <=128){
             this.channel--;
        
        }
       
        
    } 
    
    public void volumeUp(){
        if( this.volumelevel >=1 && this.volumelevel <=18){
            this.volumelevel++;
        }
        
        
    }
    public void volumeDown(){
        if( this.volumelevel >=1 && this.volumelevel <=18){
            this.volumelevel--;
        }
        
        
        
    }
}
