package arrays;

// In one dimentional arrays deep copy is performed
// In multi dimentional arrays shallow copy is performed --> cloned array uses same memory location as original.

public class Cloning {
    public static void main(String[] args) {

        // DEEP COPY

        int[] a = {1, 2, 3, 4};
        int[] c = a.clone();
        c[1] = 5;
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

        for (int i = 0; i < c.length; i++){
            System.out.print(c[i]+" ");
        }
        System.out.println();



        // SHALLOW COPY

        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] copy_arr = arr.clone();

        System.out.println("before changing");
        System.out.println();

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(copy_arr[i][j]);
            }
            System.out.println();
        }

        arr[0][0]=9;

        System.out.println();
        System.out.println("after changing");
        System.out.println();

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(copy_arr[i][j]);
            }
            System.out.println();
        }
    }
}
