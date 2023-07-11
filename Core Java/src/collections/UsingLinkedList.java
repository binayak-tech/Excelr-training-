package collections;

import java.util.LinkedList;
import java.util.List;

public class UsingLinkedList {
    public static void main(String[] args) {
        List<Integer> lList= new LinkedList<>();

        lList.add(166);
        lList.add(12);
        lList.add(1324);
        lList.add(143);
        lList.add(1434);
        System.out.println(lList);

        lList.remove(2);
        System.out.println(lList);


        System.out.println(lList.get(3));

        lList.set(0,1135);
        lList.set(1,200);
        lList.set(2,350);
        System.out.println(lList);
    }
}
