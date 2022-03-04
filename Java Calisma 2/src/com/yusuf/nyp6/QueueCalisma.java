package com.yusuf.nyp6;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueCalisma {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        queue.offer(1);
        queue.offer(5);
        queue.offer(4);
        queue.offer(3);
        queue.offer(2);
        queue.offer(6);

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        System.out.println("****************************");
        priorityQueue.offer(1);
        priorityQueue.offer(5);
        priorityQueue.offer(4);
        priorityQueue.offer(3);
        priorityQueue.offer(2);
        priorityQueue.offer(6);
        System.out.println(priorityQueue.contains(4));
//        priorityQueue.clear();
        for(Integer i:priorityQueue){
            System.out.println(i);
        }
            System.out.println("----------------------------------------");
            while(!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }
    }
}
