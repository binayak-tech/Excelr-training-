package collections;

import java.util.HashSet;
import java.util.Set;

public class UsingSet {
    // for custom classes
    public static void main(String[] args) {
        Set<Student> stu = new HashSet<>();

        stu.add(new Student("Binayak", 1));
        stu.add(new Student("Rohit", 2));
        stu.add(new Student("Rama", 4));
        stu.add(new Student("Binayak", 3));

        System.out.println(stu);

    }
}
