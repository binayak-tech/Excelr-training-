package collections;

import java.util.Stack;

public class UsingStack {
    // stack uses LIFO - last in first out
    public static void main(String[] args) {

        Stack<Integer> numbers = new Stack<>();

        // push -- adding an element at the top
        numbers.push(10);
        numbers.push(20);
        numbers.push(30);
        numbers.push(40);
        numbers.push(50);
        System.out.println(numbers);

        // pop -- removing an element from the top
        numbers.pop();
        System.out.println(numbers);

        // peek -- topmost element
        System.out.println("peek - "+numbers.peek());
        System.out.println(numbers);


    }
}
