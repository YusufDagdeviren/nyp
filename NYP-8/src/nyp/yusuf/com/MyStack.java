
package nyp.yusuf.com;

import java.util.ArrayList;

public class MyStack {
    private ArrayList<Integer> list = new ArrayList<>();
    
    public boolean isEmpty(){
        if(list.isEmpty()){
            return true;
        }
        return false;
     
    }
    public int getSize(){
        return list.size();
    }
    public int peek(){
        if(isEmpty())
        {
            System.out.println("StackUnderFlow");
            return Integer.MIN_VALUE;
        }
        int size = list.size();
       return list.get(size-1);
    }
    public void push(int deger){
        list.add(deger);
    }
    public int pop(){
        
        if(isEmpty()){
            System.out.println("StackUnderFlow");
            return Integer.MIN_VALUE;
        }
        int size = list.size();
        int data = list.get(size-1);
        list.remove(size-1);
        return data;
        
    }
    
    
    
    
    
    
    
}
