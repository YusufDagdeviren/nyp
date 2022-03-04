package com.yusuf.CollectionTekrar;


import java.util.ArrayList;

class GenericStack<E>{
   private ArrayList<E> list=new ArrayList<>();
   public int getSize(){
       return list.size();
   }
   public E peek(){
       return list.get(getSize()-1);
   }
   public void push(E e){
       this.list.add(e);
   }
   public E pop(){
      E temp=list.get(list.size()-1);
      list.remove(list.size()-1);
      return temp;

   }
   public boolean isEmpty(){
       return list.isEmpty();
   }

    @Override
    public String toString() {
        return list.toString();
    }
}



public class Main {
    public static void main(String[] args) {
        //Bir adet GenericStack adında Generic sınıf tanımlayın bu sınıfın içinde ArrayList tanımlayın ve gerekli
        //getSize, peek, push, pop, isEmpty metodlarını yazınız?
        GenericStack<String> genericStack=new GenericStack<>();
        System.out.println(genericStack.getSize());
        genericStack.push("yusuf");
        genericStack.push("zehra");
        genericStack.push("umut");
        genericStack.push("atakan");
        genericStack.push("ozcan");
        System.out.println(genericStack);
        System.out.println(genericStack.peek());
        System.out.println(genericStack.pop());
        System.out.println(genericStack.pop());
        System.out.println(genericStack.pop());
        System.out.println(genericStack.isEmpty());





    }
}
