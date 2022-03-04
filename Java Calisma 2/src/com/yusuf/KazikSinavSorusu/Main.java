package com.yusuf.KazikSinavSorusu;

public class Main {
    public static void main(String[] args) {
        NodeStack<Integer> nodeStack = new NodeStack<>();
        nodeStack.push(1);
        nodeStack.push(2);
        nodeStack.push(3);
        System.out.println(nodeStack.pop());//3
        System.out.println(nodeStack.pop());//2
        System.out.println(nodeStack.pop());//1
    }


}
