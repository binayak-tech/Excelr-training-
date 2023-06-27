package arrays;

import java.util.Scanner;

public class OneDArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i=0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("\nEnter the elements of the array");
        for (int i=0; i<size; i++) {
            a[i] = sc.nextInt();
        }
    }
}
