package com.yusuf.KazikSinavSorusu;

public class Node<E> {
    private Node<E> next;
    private E item;
    public Node(Node<E> next,E item){
        this.next = next;
        this.item = item;
    }

    public Node() {
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public E getItem() {
        return item;
    }

    public void setItem(E item) {
        this.item = item;
    }
}
