package StringProblems;

// Remove All Spaces from string
public class Solution8 {

    public static void removeAllSpaceFromString(String str) {

        if (str == null || str.isEmpty()) {
            System.out.println("String is empty or null");
            return;
        }

        int n = str.length();

        StringBuilder sb = new StringBuilder(n);

        // Via Method directlly
        // str = str.replace(" ", "");
        // System.out.println(str);

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        String str = "   Hello  ";
        removeAllSpaceFromString(str);

    }

}
