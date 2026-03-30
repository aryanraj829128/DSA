package StacksandQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Inbuiltquere {
    public static void main(String[] args) {
//        Queue<Integer> queue = new LinkedList<>(); //first in first out
//        queue.add(3);
//        queue.add(6);
//        queue.add(5);
//        queue.add(19);
//        queue.add(1);
//
//        System.out.println(queue.peek());//gets the item but not removes the item
//        System.out.println(queue.remove());//removers the item


        Deque<Integer> deque= new ArrayDeque<>(); //double ended queue add and remove from both sides
        System.out.println(deque.add(83));
        deque.addLast(78); //println is expecting a value to print, but addLast() gives nothing — not even true or false.
//Do this” → no need to confirm because it’s almost always successful in ArrayDeque (no capacity limit by default).
        //so you can't write sout in addLast
        System.out.println(deque.removeFirst());

    }
}
