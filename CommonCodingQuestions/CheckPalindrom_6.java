package CommonCodingQuestions;

// Q #6) Write a Java Program to find whether a string or number is palindrome or not.

public class CheckPalindrom_6 {

    // for integer
    public static boolean checkPalindromeInteger(int num) {
        if (num < 0) {
            return false;
        }
        int rev = 0;
        int tmp = num;
        while (num != 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        return rev == tmp;
    }

    // for string
    public static boolean checkPalindromeString(String str) {
        if (str == null) {
            return false;
        }
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {

        int num = 12321;
        String str = "abcba";
        System.out.println(checkPalindromeInteger(num));
        System.out.println(checkPalindromeString(str));

    }

}