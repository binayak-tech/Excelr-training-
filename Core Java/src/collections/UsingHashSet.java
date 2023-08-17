package collections;

import java.util.HashSet;
import java.util.Set;

public class UsingHashSet {
    // it doesn't allow duplicate elements.
    // items are not stored in any order

    public static void main(String[] args) {

        Set<Integer> hSet = new HashSet<>();
        hSet.add(34);
        hSet.add(884);
        hSet.add(346);
        hSet.add(3464);

        System.out.println(hSet);

        hSet.add(34); // this will not be added in the set
        System.out.println(hSet);

        // size()
        System.out.println(hSet.size());


        // remove()
        hSet.remove(346);
        System.out.println(hSet.remove(4390)); // returns false
        System.out.println(hSet);


        // contains()
        System.out.println(hSet.contains(884));  // returns true
        System.out.println(hSet.contains(886));  // returns false


        // isEmpty()
        System.out.println(hSet.isEmpty());  // will return false

        // clear()
        // hSet.clear();
    }
}
