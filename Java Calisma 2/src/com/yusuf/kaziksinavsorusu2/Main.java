package com.yusuf.kaziksinavsorusu2;

public class Main {
    public static void main(String[] args) {
        NodeStack<Integer> nodeStack=new NodeStack<>();
        nodeStack.push(54);
        nodeStack.push(87);
        nodeStack.push(12);


        System.out.println(nodeStack.pop());
    }
}
