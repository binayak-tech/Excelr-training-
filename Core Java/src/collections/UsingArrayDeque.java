package collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class UsingArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        // offer
        adq.offer(43);
        adq.offer(54);
        adq.offer(86);
        adq.offerFirst(32);
        adq.offerLast(838);
        System.out.println(adq);

        // peek
        System.out.println("first element "+adq.peekFirst());
        System.out.println("last element "+adq.peekLast());

        // poll
        adq.poll();
        adq.pollLast();
        adq.pollFirst();
        System.out.println("After poll, pollFirst, and pollLast ");
        System.out.println(adq);


    }
}
