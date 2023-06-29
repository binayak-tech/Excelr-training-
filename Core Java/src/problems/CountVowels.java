package problems;
import java.util.Scanner;
public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vowels_count = 0;
        int constants_count = 0;
        System.out.print("Enter a string: ");
        String str = sc.next();
        str = str.toUpperCase();
        char[] strArr = str.toCharArray();

        for (char j : strArr){
            if( j == 'A' || j == 'E' || j == 'I' || j == 'O' || j == 'U' ){
                vowels_count++;
            }else{
                constants_count++;
            }
        }

        System.out.println("Number of Vowels : "+vowels_count);
        System.out.println("Number of Constats : "+constants_count);
    }
}
