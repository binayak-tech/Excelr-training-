package strings;

public class StringBuffers {
//A string buffer is like a String , but can be modified. Unlike usual Strin which is immutable
// At any point in time it contains some particular sequence of characters,
// but the length and content of the sequence can be changed through certain method calls.

    public static void main(String[] args) {
        StringBuffer S= new StringBuffer("hyderabad");
        System.out.println(S); // hyderabad
		S = S.append("bangalore");
		System.out.println(S); // hyderabadbangalore

		S=S.insert(9, " delhi ");
		System.out.println(S); // hyderabad delhi bangalore

		S=S.delete(0, 3);
		System.out.println(S); // erabad delhi bangalore

		S=S.delete(2,3);
		System.out.println(S); // erbad delhi bangalore


		S=S.deleteCharAt(5);
		System.out.println(S); // erbaddelhi bangalore

        S=S.replace(0, 5, "hello");
        System.out.println(S); // hellodelhi bangalore
    }
}
