package problems;

import java.util.Scanner;

public class SumOfIndividualDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digit, sum=0, squareSum=0;
        while(num > 0){
            digit = num%10;
            sum += digit;
            squareSum += Math.pow(digit,2);
            num /= 10;
        }
        System.out.println("Sum of individual digits is equal to : "+sum);
        System.out.println("Sum of squares of individual digits is equal to : "+squareSum);
    }
}
