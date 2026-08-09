package StringProblems;

// Reverse a string using two-pointer approach
public class Solution5 {

    public static void reverseString(String str) {

        if (str == null || str.isEmpty()) {
            System.out.println("String is empty or null");
            return;
        }
        char ch[] = str.toCharArray();
        int start = 0;
        int end = ch.length - 1;
        while (start < end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        str = new String(ch);
        System.out.println(str);
    }

    public static void main(String[] args) {
        String str = "Hello";
        reverseString(str);

    }

}
