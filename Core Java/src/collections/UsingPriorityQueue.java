package collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class UsingPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> number = new PriorityQueue<>();

        number.offer(15);
        number.offer(25);
        number.offer(35);
        number.offer(45);
        number.offer(55);

        System.out.println(number);
    }
}
