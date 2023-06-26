import java.sql.SQLOutput;

public class Operators {

    static void arithmetic_op(int a, int b){
        System.out.println("ARITHMATIC OPERATORS");
        System.out.println("a + b = "+ (a+b));
        System.out.println("a - b = "+ (a-b));
        System.out.println("a * b = "+ (a*b));
        System.out.println("a / b = "+ (a/b));
        System.out.println("a % b = "+ (a%b));
        System.out.println("++a = "+ (++a));
        System.out.println("a++ = "+ (a++));
        System.out.println("--b = "+ (--b));
        System.out.println("b-- = "+ (b--));

    }

    static void logical_op(){
        System.out.println("LOGICAL OPERATORS");
        System.out.println("TRUE && TRUE = "+ (true && true));
        System.out.println("TRUE && FALSE = "+ (true && false));
        System.out.println("FALSE && TRUE = "+ (false && true));
        System.out.println("FALSE && FALSE = "+ (false && false));
        System.out.println("-------------------");

        System.out.println("TRUE || TRUE = "+ (true || true));
        System.out.println("TRUE || FALSE = "+ (true || false));
        System.out.println("FALSE || TRUE = "+ (false || true));
        System.out.println("FALSE || FALSE = "+ (false || false));
        System.out.println("-------------------");

        System.out.println("!TRUE = " + (!true));
        System.out.println("!FALSE = " + (!false));
    }

    static void ternary_op(){
        System.out.println("TERNARY OPERATOR");
        int n1 = 5, n2 = 10, max;
        System.out.println("First num: " + n1);
        System.out.println("Second num: " + n2);

        // Largest among n1 and n2
        max = (n1 > n2) ? n1 : n2;

        // Print the largest number
        System.out.println("Maximum is = " + max);
    }

    static void bitwise_op(){
        System.out.println("BITWISE OPERATORS");
        System.out.println(" 5 | 7 = "+(5|7));
        System.out.println(" 5 & 7 = "+(5&7));
        System.out.println(" 5 ^ 7 = "+(5^7));
        System.out.println(" ~5&7 | 5&~7 = "+(~5&7 | 5&~7));
        System.out.println(" ~5 = "+(~5&0x0f));
    }

    static void relationsal_op(){
        System.out.println("Relational operators");
        System.out.println("Relational operators are mainly used for comparisons");
        System.out.println(">, <, >=, <=, ==, !=");
    }

    public static void main(String[] args) {
        arithmetic_op(10, 5);
        logical_op();
        ternary_op();
        bitwise_op();
    }
}
