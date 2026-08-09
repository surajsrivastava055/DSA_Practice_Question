package StringProblems;

// Check String is Pallimdrome or not
public class Solution6 {

    public static void checkPalindrom(String str) {

        if (str == null || str.isEmpty()) {
            System.out.println("String is empty or null");
            return;
        }

        // Approach 1st
        /*
         * // reversing a String using method.
         * String rev = new StringBuilder(str).reverse().toString();
         * if (str.equals(rev)) {
         * System.out.println("String is Palindrome");
         * } else {
         * System.out.println("String is not Palindrome");
         * }
         */
        // Approach 2nd
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                System.out.println("String is not Pallindrome");
                return;
            }
            start++;
            end--;
        }
        System.out.println("String is pallindrome");

    }

    public static void main(String[] args) {
        String str = "AayA";
        checkPalindrom(str);

    }

}
