package StringProblems;

// Convert String to upper case without using pre define method
public class Solution7 {

    public static void convertStringToUpperCase(String str) {

        if (str == null || str.isEmpty()) {
            System.out.println("String is empty or null");
            return;
        }

        int n = str.length();
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                // ch = (char) (ch - 32);
                // or
                ch = (char) (ch - ('a' - 'A'));
            }
            sb.append(ch);
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        String str = "Hello";
        convertStringToUpperCase(str);

    }

}
