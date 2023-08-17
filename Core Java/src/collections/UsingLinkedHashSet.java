package collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class UsingLinkedHashSet {

    // it follows the order of entry unlike HashSet

    public static void main(String[] args) {
        Set<Integer> linked_hSet = new LinkedHashSet<>();
        linked_hSet.add(34);
        linked_hSet.add(884);
        linked_hSet.add(93);
        linked_hSet.add(346);
        linked_hSet.add(3464);

        System.out.println(linked_hSet);

        linked_hSet.add(34); // this will not be added in the set
        System.out.println(linked_hSet);

        // size()
        System.out.println(linked_hSet.size());


        // remove()
        linked_hSet.remove(346);
        System.out.println(linked_hSet.remove(4390)); // returns false
        System.out.println(linked_hSet);


        // contains()
        System.out.println(linked_hSet.contains(884));  // returns true
        System.out.println(linked_hSet.contains(886));  // returns false


        // isEmpty()
        System.out.println(linked_hSet.isEmpty());  // will return false

        // clear()
        // linked_hSet.clear();
    }
}
