package StringProblems;

// Count length of String without using length()
public class Solution2 {

    public static void findLength(String str) {

        if (str == null || str.isEmpty()) {
            System.out.println("String is empty or null");
            return;
        }

        int count = 0;

        char[] arr = str.toCharArray();

        for (char ch : arr) {
            count++;
        }

        System.out.println("Length of string: " + count);
    }

    public static void main(String[] args) {
        String str = "Hello";
        findLength(str);
    }
}