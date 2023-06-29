package strings;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String s1="binayak";
        String s2="binayak";
        String s3="Binayak";
        String Str = " ";
        String Str2 = "";
        String statement = "I am a Java full stack developer";
        String firstName = "John ";
        String lastName = "Doe";
        String trimThis = "    My name is Bk    ";

        // concatination
        System.out.println(firstName.concat(lastName));

        // finding index
        System.out.println(statement.indexOf("a")); // 2
        System.out.println(statement.indexOf("z")); // -1  (because it is not available)
        System.out.println(statement.lastIndexOf("a")); // 19

        // replacemnet
        System.out.println(s2.replace('b', 'g'));

        // equality check
		System.out.println(s1.equals(s2));// true
		System.out.println(s1.equals(s3)); // false
		System.out.println(s1.equalsIgnoreCase(s3)); //true
        System.out.println(s1.compareTo(s2));//0
        System.out.println(s1.compareTo(s3));//100-68 = 32
    	System.out.println(s1.compareToIgnoreCase(s3));//0

        // empty check
        System.out.println(Str.isEmpty());//false
        System.out.println(Str2.isEmpty());// true
        System.out.println(Str2.isBlank());// true

        // removing leading and trailling whitespaces are removed
        System.out.println(trimThis.trim()); // strip is evolution of trim
        System.out.println(trimThis.strip());
        System.out.println(trimThis.stripLeading());
        System.out.println(trimThis.stripTrailing());

        // repeating
        System.out.println(s1.repeat(3));

        // find characters
        System.out.println(s1.charAt(3)); // a
        System.out.println(s1.startsWith("bink")); // false
        System.out.println(s1.endsWith("ak")); // true

        // case convertion
        System.out.println(s1.toUpperCase()); // BINAYAK
        System.out.println(s1.toLowerCase()); // binayak

        // spilitting string
        String stmt[] = statement.split(" ");
        for (String s : stmt){
            System.out.print(s+", ");
        }
        System.out.println();


        // string to array conversion using toString
        char dest[]=new char[20];
        statement.getChars(0,15,dest,0);
        System.out.print(Arrays.toString(dest));
        System.out.println();


        // string to array using toCharArray() method
        char d[]=s1.toCharArray();
        for(int i=0;i<d.length;i++)
        {
            System.out.print(d[i]+" ");
        }
        System.out.println();
    }
}
