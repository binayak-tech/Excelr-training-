package arrays;
import java.util.Scanner;

public class Inserting {

    // printing the array
    static void print_array(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // getting user inputs
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] a = new int[size];
        int[] temp = new int[size+1];
        System.out.println("\nEnter the elements of the array");
        for (int i=0; i<size; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter which element you want to insert");
        int ele = sc.nextInt();
        System.out.println("Enter which element you want to insert");
        int pos = sc.nextInt();
        pos -= 1;

        // inserting an element
        for(int i = 0; i < size+1; i++){
            if (i<pos){
                temp[i] = a[i];
            } else if (i > pos) {
                temp[i] = a[i-1];
            } else {
                temp[i] = ele;
            }
        }

        System.out.println("Array after insertion");
        print_array(temp);

    }
}
