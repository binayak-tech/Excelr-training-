package problems;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class reverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int digit, revNum=0, temp=num;
        while(num>0){
            digit = num%10;
            revNum = revNum * 10 + digit;
            num /= 10;
        }
        System.out.println("Reverse of the given number is "+revNum);
        if(revNum == temp){
            System.out.println("It is a palindrome");
        }
        else System.out.println("It is not a palindrome");
    }

}
