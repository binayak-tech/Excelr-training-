public class ReverseString {
    public static void main(String[] args) {
        String input = "APPLE";
        char[] charArray = input.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }

        String reversed = new String(charArray);
        System.out.println(reversed);
    }
}
