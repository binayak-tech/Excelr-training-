package collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UsingArrayList {
    // java arrays cannot change its size dynamically therefore we use
    // arrayList where it dynamically changes size as required

    public static void main(String[] args) {
//        dynamic size allocation
//        initial size lets assume 10
//        size = n
//                new size = n + n/2 + 1


        ArrayList<String> studentsList = new ArrayList<>();
        studentsList.add("Binayak");
        System.out.println(studentsList);
        studentsList.add("Ganesh");
        studentsList.add("Bk");
        System.out.println(studentsList);


        // add
        List<Integer> arr = new ArrayList();
        arr.add(1);
        arr.add(3);
        arr.add(3);
        arr.add(4);
        System.out.println(arr);
        arr.add(1,2);
        System.out.println(arr);

        // get
        System.out.println(arr.get(3));

        // remove -- bigO(n)
        arr.remove(4);
        System.out.println(arr);
        arr.remove(Integer.valueOf(3));
        System.out.println(arr);

        // arr.clear(); // clears the entire list


        // set  -- bigO(1)
        arr.set(0,10);
        arr.set(1,20);
        arr.set(2,30);
        System.out.println(arr);


        // contains -- bigO(n)
        System.out.println(arr.contains(100));


        // iteration
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        for (Integer ele : arr){
            System.out.println(ele);
        }

        Iterator<Integer> it = arr.listIterator();
        while(it.hasNext()) {
            System.out.println("Iterator "+ it.next());
        }
    }
}
