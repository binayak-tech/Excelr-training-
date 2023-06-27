package arrays;

import java.util.Scanner;

public class twoDArray {

    static void sum_of_array(int r, int c, int[][] arr1, int[][] arr2){
        int[][] sum_arr = new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                sum_arr[i][j]= arr1[i][j] + arr2[i][j];
            }
        }
        print_array(sum_arr,r,c);
    }

    static void print_array(int[][] arr, int r, int c){

        System.out.println("The sum of both the arrays - ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    static int[][] create_array(int r, int c){
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[r][c];
        System.out.println("enter the elements of an array");
        int i,j;
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                a[i][j]= sc.nextInt();
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n, r, c;
        System.out.println("Enter no. of rows in first array");
        m = sc.nextInt();
        System.out.println("Enter no. of columns in second array");
        n = sc.nextInt();
        System.out.println("Enter no. of rows in first array");
        r = sc.nextInt();
        System.out.println("Enter no. of rows in second array");
        c = sc.nextInt();


        System.out.println("First Array");
        int[][] arr1 = create_array(m,n);
        System.out.println("\n\nSecond Array");
        int[][] arr2 = create_array(r,c);

        sum_of_array(r, c, arr1, arr2);
    }
}
