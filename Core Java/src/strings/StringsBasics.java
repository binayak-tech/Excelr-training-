package strings;

import java.util.Scanner;

// In Java, string is basically an object that represents sequence of char values.
// An array of characters works same as Java string.

public class StringsBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // creating a string in java
        // methods - 1) using string literal, 2) using new keyword


        // using new keyword -- MEMORY INEFFICIENT
        // JVM will create a new string object in normal (non-pool) heap memory,
        // and the literal "Welcome" will be placed in the string constant pool.
        // The variable s will refer to the object in a heap (non-pool).
        char[] ch = {'b','i','n','a','y','a','k'};
        String s = new String(ch);
        System.out.println(s);

        // using sting literal -- MEMORY EFFICIENT
        // Jvm checks string constant pool if the string is already exist then,
        // it will return the reference of the previous sting and does not create a new instance
        String f_name;
        String l_name;
        String ph_no;

        System.out.print("enter the student first name: ");
        f_name= sc.next();

        System.out.print("\nenter the student last name: ");
        l_name= sc.next();

        System.out.print("\nenter the student phone no: ");
        ph_no= sc.next();

        System.out.println("\nfirst name="+f_name);
        System.out.println("last name="+l_name);
        System.out.println("phone no="+ph_no);
    }
}
