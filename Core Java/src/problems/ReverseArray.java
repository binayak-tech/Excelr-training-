package problems;

public class ReverseArray {
    public static void print_array(int[] arr){
        for (int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] original_arr = {1, 2, 3};
        int len = original_arr.length;
        int[] reversed_arr = new int[3];
        len = len-1;

        for (int i = len; i >= 0; i--){
            reversed_arr[len-i] = original_arr[i];
        }
        System.out.println("original array");
        print_array(original_arr);
        System.out.println("reversed array");
        print_array(reversed_arr);
    }
}
