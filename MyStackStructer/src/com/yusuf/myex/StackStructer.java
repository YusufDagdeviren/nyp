
package com.yusuf.myex;







public class StackStructer {
    
    private int size = -1; // otomatik 0 olarak atama yapılır
    private int[] element;
    private static final int DİMENSİON = 16;

    public StackStructer() {
        this(DİMENSİON); // Kurucu metoda yolla 
    }

    
    
    public StackStructer(int capacity) {
	
        element = new int[capacity];
    }
    public void push(int sayi){
        /*
        bu metod sona ekleme yapar
        */
        if(size>= element.length){
            int[] temp = new int[element.length *2];
            System.arraycopy(element, 0, temp, 0, element.length); // 1. kopyalanacak dizi 2.neresinden başla 3.yeni dizi 4.neresinden başla,5.nereye kadar
            element = temp;
            
        }
        element[++size] = sayi; // İlk çalıştığında size 1 oldu fakat 0.indiste değer var
        
        
    }
    public int pop(){
             
        if(isEmpty()){
            System.out.println("Zaten Liste Boş");
            return Integer.MIN_VALUE;
        }
        return element[size--]; //İlk çalıştığında size 1 fakat 0. indiste değer var

        
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Zaten Liste Boş");
            return Integer.MIN_VALUE;
        }
            
        return element[size]; 
        
    }
    
    
    public boolean isFull(){
        
     if(size>=element.length-1){
         return true;
     }else{
         return false;
     }
        
        
    } 
    public boolean isEmpty(){
        
       if(size == -1){
           return true;
       }else{
           return false;
           
       }
        
        
        
    } 
    
}
