package StringProblems;

// count words of sentence
public class Solution11 {

    public static void countWords(String str) {

        if (str == null || str.isEmpty()) {
            System.out.println("String is empty or null");
            return;
        }

        String arr[] = str.trim().split("\\s+");

        // 1st way
        // System.out.println(arr.length);

        // 2nd way
        int count = 0;
        for (String data : arr) {
            count++;
        }
        System.out.println(count);

    }

    public static void main(String[] args) {
        String str = "Hello Gyan Shri h hhbkgj uihhk h ";
        countWords(str);

    }

}
