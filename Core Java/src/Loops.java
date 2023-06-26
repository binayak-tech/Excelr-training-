public class Loops {
    static void for_loop(){
        int n = 23;
        System.out.println("Table of "+n);
        for (int i=1; i <= 10; i++){
            System.out.println(n+" x "+i+" = "+n*i);
        }
        System.out.println("---------------------");

//        sum of series
        System.out.println("Sum of series");
        int sum = 1, k = 10;
        System.out.print("1");
        for (int i = 2; i<=k; i++){
            System.out.print(" + "+i);
            sum+=i;
        }
        System.out.println(" = "+sum);
        System.out.println("---------------------");

//        even and odd number series
        int z = 60;
        System.out.println("Even Number Series");
        for (int i = 2; i <= z; i+=2){
            System.out.print(i+" ");
        }
        System.out.println("\nOdd Number Series");
        for (int i = 1; i <= z; i+=2){
            System.out.print(i+" ");
        }
        System.out.println("\n---------------------");


//        finding factorial
        System.out.println("Factorial program");
        int num = 5, result = 1;
        for (int i = 1; i<=5; i++){
            result *= i;
        }
        System.out.println("The factorial of "+num+" = "+result );
    }


    static void while_loop(){
        boolean is_active = true;
        int n = 1;
        while(is_active){
            if (n == 17){
                is_active = false;
            }
            System.out.println("I am BINAYAK");
            n += 2;
        }
    }


    static void do_while_loop(){

//        in do while loop a the loop is iterated at least once regardless of the condition
        do{
            System.out.println("My name is Binayak Purohit");
        } while(1 == 2);
    }

    public static void main(String[] args) {
        for_loop();
        while_loop();
        do_while_loop();
    }
}
