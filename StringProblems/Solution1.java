package StringProblems;

//Print each character of the String.
public class Solution1 {

    public static void printEachCharacter(String str) {

        if (str == null || str.isEmpty()) {
            System.out.println("String is empty or null");
            return;
        }

        int n = str.length();

        for (int i = 0; i < n; i++) {
            System.out.println(str.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str = "Hello";
        printEachCharacter(str);

    }
}
