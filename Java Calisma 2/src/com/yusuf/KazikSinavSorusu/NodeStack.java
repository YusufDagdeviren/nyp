package com.yusuf.KazikSinavSorusu;

import java.util.ArrayList;

public class NodeStack<E> {
    private Node<E> stack;
    public NodeStack(){
        stack = null;
    }
    public void push(E e){
        stack = new Node<>(stack,e);
    }
    public E pop(){
        if(stack==null){
            return null;
        }
        E top = stack.getItem();
        stack = stack.getNext();
        return top;
    }
    public E peek(){
        if(stack==null){
            return null;
        }
        return stack.getItem();
    }
}
