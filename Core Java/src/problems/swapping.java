package problems;

public class swapping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("before swap");
        System.out.println("A = "+a+" B = "+b);

//        int temp = a;
//        a = b;
//        b = temp;

        a += b;
        b = a - b;
        a = a - b;

//        a *= b;
//        b = a / b;
//        a = a / b;

        System.out.println("after swap");
        System.out.println("A = "+a+" B = "+b);
    }
}
