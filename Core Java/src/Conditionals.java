import java.util.Scanner;
public class Conditionals {
    public static void main(String[] args) {
        // if else
        int a = 10;
        int b = 20;
        if (a>b) System.out.println("a is maximum");
        else System.out.println("b is maximum");

        // if else if ladder
        int c = 30;
        if(a>b){
            System.out.println("a is maximum");
        } else if (b>c) {
            System.out.println("b is maximum");
        }else System.out.println("c is maximum");

        // switch case
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your choice (1-3): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You got kitkat");
                break;
            case 2:
                System.out.println("You got Oreo");
                break;
            case 3:
                System.out.println("You got Ice-cream");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
