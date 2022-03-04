package com.yusuf.kaziksinavsorusu2;

public class NodeStack<E>{
    private Node<E> stack;
    public NodeStack(){
        stack=null;
    }
    public void push(E e){
        stack=new Node<>(stack,e);
    }
    public E pop(){
        if(stack==null){
            return null;
        }
        E popped=stack.getItem();
        stack=stack.getNext();
        return popped;
    }
    public E peek(){
        if (stack==null){
            return null;
        }
        return stack.getItem();
    }
}
