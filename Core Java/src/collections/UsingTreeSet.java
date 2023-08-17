package collections;

import java.util.Set;
import java.util.TreeSet;

public class UsingTreeSet {
    // elements are unique and sorted

    public static void main(String[] args) {
        Set<Integer> tSet = new TreeSet<>();  // time complexity O(logn) -- it uses binary tree

        tSet.add(32);
        tSet.add(337);
        tSet.add(2352);
        tSet.add(43);
        tSet.add(7534);

        System.out.println(tSet);
    }
}
