
package nyp.com.yusuf;

public class StackOfIntegers {
    
    private int[] elements;
    private int size = 0;
    private static final int CAPACITY = 16;

    public StackOfIntegers() {
        this(CAPACITY); //Kurucu metodu cagirir
    }

    public StackOfIntegers(int capacity) {
       elements = new int[capacity];
    }
    public boolean empty(){
        return size==0;
        /*if(size==0){
            return true;
            
        }
        return false;*/
    }
    public void push(int value){
        
        if(size>=elements.length){
            int[] temp = new int[elements.length *2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
            
        }
        elements[size++] = value;
        
    }
    public int pop(){
        
        return elements[--size];
        

    }
    public int getSize(){
        
        return size;
        
    }
    public int peek(){
        
        return elements[size- 1];
        
    }
    
}
