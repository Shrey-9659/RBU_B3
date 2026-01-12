package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class StackExample {
    public static void main(String[] args) {
        Queue<Integer> qu = new LinkedList<>();
        qu.offer(5);
        qu.offer(5);
        System.out.println(qu.size());
        System.out.println(qu.poll());
        System.out.println(qu.size());
    }
}
