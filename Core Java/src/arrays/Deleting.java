package arrays;

import java.util.Scanner;

public class Deleting {
    // printing the array
    static void print_array(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int position = 0, flag = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] a = new int[size];
        int[] temp = new int[size-1];
        System.out.println("\nEnter the elements of the array");
        for (int i=0; i<size; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter which element you want to delete");
        int ele = sc.nextInt();

        // finding the position of element to be deleted
        for (int i=0; i<size; i++){
            if (a[i] == ele){
                position = i;
                flag = 1;
                break;
            }
        }

        // deleting the element
        if(flag == 1) {
            for (int i = 0; i < size - 1; i++) {
                if (i < position) {
                    temp[i] = a[i];
                } else {
                    temp[i] = a[i + 1];
                }
            }
            System.out.println("Array before deletion");
            print_array(a);

            System.out.println("Array after deletion");
            print_array(temp);
        }
        else {
            System.out.println("Element doesn't exist");
        }
    }
}
