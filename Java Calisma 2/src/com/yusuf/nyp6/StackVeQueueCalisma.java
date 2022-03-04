package com.yusuf.nyp6;

import java.util.Stack;

public class StackVeQueueCalisma {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        stack.push("yusuf");
        stack.push("atakan");
        stack.push("ozcan");
        stack.push("umut");
        stack.push("zehra");

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        stack.pop();

    }
}
