package collections;

import java.util.LinkedList;
import java.util.Queue;

public class UsingLinkedListQueue {
//    queue follows first in first out (FIFO) approach.

    public static void main(String[] args) {
        Queue<Integer> num = new LinkedList<>();

        // offer() - add elements
        // add() throws an exception in case of unsuccessful attempt but offer simply returns false
        num.offer(10);
        num.offer(20);
        num.offer(30);
        num.offer(40);
        num.offer(50);

        System.out.println(num);

        // poll() - removing head
        // remove() throws an exception in case of empty queue, poll() returns null
        num.poll();
        System.out.println(num);

        // peek() - head element
        // element() throws exception for empty queue, peek() returns null
        System.out.println(num.peek());
    }
}
