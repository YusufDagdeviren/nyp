
package com.yusuf.myex;

public class StackStucter2 {
    
    
    private int[] elements;
    private int size;
    private static int varsayilan = 15;
    public StackStucter2() {
        this(varsayilan);
    }

    public StackStucter2(int capacity) {
        elements = new int[capacity];
    }
   
    public boolean empty(){
        if(size == 0){
            return true;
        }else{
            return false;
        }
        
    }
    public void push(int sayi){
        
        if(size>= elements.length){
            int[] temp = new int[elements.length *2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = sayi;

    }
    public int pop(){
        
        if(empty()){
            System.out.println("Silinecek eleman yok");
            return Integer.MIN_VALUE;
        }
        return elements[--size];
      
    }
    public int peek(){
        if(empty()){
            System.out.println("Gösterilecek eleman yok");
            return Integer.MIN_VALUE;
        }
        return elements[size -1];
        
    }
    
    public int getSize(){
        return size ;
        
    }
    
}
