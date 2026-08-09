package StringProblems;

// check if String contain any digit or not
public class Solution9 {

    public static void containsDigit(String str) {

        if (str == null || str.isEmpty()) {
            System.out.println("String is empty or null");
            return;
        }

        int n = str.length();

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }

    public static void main(String[] args) {
        String str = "Hello9";
        containsDigit(str);

    }

}
