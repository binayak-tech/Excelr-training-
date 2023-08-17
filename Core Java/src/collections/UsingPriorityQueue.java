package collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class UsingPriorityQueue {
    // It uses minHeap by default which places the smallest element at the head
    public static void main(String[] args) {
        Queue<Integer> number = new PriorityQueue<>();

        number.offer(15);
        number.offer(25);
        number.offer(10);
        number.offer(45);
        number.offer(55);
        System.out.println(number);

        number.poll();
        System.out.println(number);


        System.out.println(number.peek());


        // for implementing maxHeap
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(15);
        pq.offer(25);
        pq.offer(10);
        pq.offer(45);
        pq.offer(55);
        System.out.println(pq);

        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());
    }
}
