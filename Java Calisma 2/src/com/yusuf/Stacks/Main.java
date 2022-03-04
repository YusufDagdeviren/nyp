package com.yusuf.Stacks;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Queue<Integer> queue=new LinkedList<>();
//        queue.add(23);
//        queue.add(78);
//        queue.add(74);
//        queue.add(22);
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.peek());

        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        priorityQueue.add(87);
        priorityQueue.add(54);
        priorityQueue.add(21);
        priorityQueue.add(65);
        priorityQueue.add(14);
        System.out.println(priorityQueue.contains(22));
        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }




















//        Stack<Integer> stack=new Stack<>();
//        stack.push(45);
//        stack.push(12);
//        stack.push(74);
//        stack.push(89);
//        stack.push(2);
//        while (!stack.isEmpty()){
//            System.out.println(stack.pop());
//        }
//        try {
//            System.out.println(stack.pop());
//        }catch (Exception e){
//            e.printStackTrace();
//        }

    }

}
