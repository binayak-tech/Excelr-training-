package problems;

import java.lang.Math;
import java.util.Scanner;
public class ArmstrongNumber {

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
            System.out.println("Its an armstrong number");
        }
        else {
            System.out.println("its not an armstrong number");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        find_armstrong(sc.nextInt());
    }
}
