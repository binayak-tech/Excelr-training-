package problems;
import java.util.Scanner;

public class AllOpSwitchLoop {

    static void reverseOfNumber(int num){
        int digit, revNum=0;
        while(num>0){
            digit = num%10;
            revNum = revNum * 10 + digit;
            num /= 10;
        }
        System.out.println("\nReverse of the given number is "+revNum);
    }

    static void palindrome(int num){

        int digit, revNum=0, temp=num;
        while(num>0){
            digit = num%10;
            revNum = revNum * 10 + digit;
            num /= 10;
        }
        if(revNum == temp){
            System.out.println("\nIt is a palindrome");
        }
        else System.out.println("\nIt is not a palindrome");
    }

    static void sumOfIndividualNumbers(int num){
        int digit, sum=0;
        while(num > 0){
            digit = num%10;
            sum += digit;
            num /= 10;
        }
        System.out.println("\nSum of individual digits is equal to : "+sum);
    }

    static void find_armstrong(int num){
        int sum = 0, digit;
        int temp = num;
        while(num>0){
            digit = num%10;
            sum += Math.pow(digit,3);
            num /= 10;
        }
        System.out.println(sum);
        if (sum == temp){
            System.out.println("\nIts an armstrong number");
        }
        else {
            System.out.println("\nIts not an armstrong number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean runProg = true;
        while(runProg){
            System.out.print("\nEnter 1 for sum of individual numbers program");
            System.out.print("\nEnter 2 for reverse of a number program");
            System.out.print("\nEnter 3 for checking palindrome Number");
            System.out.print("\nEnter 4 for finding armstrong Number");
            System.out.print("\nEnter 5 for exit");
            System.out.print("\n--> : ");
            int num = sc.nextInt();

            switch (num) {
                case 1 -> {
                    System.out.print("Enter a number:");
                    int num1 = sc.nextInt();
                    sumOfIndividualNumbers(num1);
                    System.out.println("------------------------");
                }
                case 2 -> {
                    System.out.print("Enter a number: ");
                    int num2 = sc.nextInt();
                    reverseOfNumber(num2);
                    System.out.println("------------------------");
                }
                case 3 -> {
                    System.out.print("Enter a number: ");
                    int num3 = sc.nextInt();
                    palindrome(num3);
                    System.out.println("------------------------");
                }
                case 4 -> {
                    System.out.print("Enter a number: ");
                    int num4 = sc.nextInt();
                    find_armstrong(num4);
                    System.out.println("------------------------");
                }
                case 5 -> runProg = false;
                default -> System.out.println("Invalid Number");
            }
        }
    }
}
