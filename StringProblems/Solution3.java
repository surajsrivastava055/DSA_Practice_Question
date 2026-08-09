package StringProblems;

// Count Vowels
public class Solution3 {

    public static void countVowels(String str) {

        if (str == null || str.isEmpty()) {
            System.out.println("String is empty or null");
            return;
        }

        int n = str.length();
        int count = 0;

        for (int i = 0; i < n; i++) {

            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("Number of vowels: " + count);
    }

    public static void main(String[] args) {
        String str = "Hello";
        countVowels(str);

    }

}
