package com.yusuf.kaziksinavsorusu2;

public class Node<E>{
    private Node<E> next;
    private E item;

    public Node(){}
    public Node(Node<E> next,E item){
        this.next=next;
        this.item=item;
    }

    public void setNext(Node<E> next){
        this.next=next;
    }
    public Node<E> getNext(){
        return next;
    }
    public void setItem(E item){
        this.item=item;
    }
    public E getItem(){
        return item;
    }

}
