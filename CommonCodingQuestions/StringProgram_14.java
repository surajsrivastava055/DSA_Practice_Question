package CommonCodingQuestions;

import java.util.Arrays;

/**
 * StringProgram_14
 * Q #14) Write a program that accepts comma-separated strings, sorts the
 * strings in ascending order, and outputs the concatenated string of sorted
 * strings.
 */
public class StringProgram_14 {

    public static void sortAndConcate(String str) {
        // 1-> split it
        String words[] = str.split(",");

        // 2-> sort it'
        Arrays.sort(words);

        // 3-> join it
        System.out.println(String.join("", words));

    }

    public static void main(String[] args) {
        String str = "banana,apple,orange,mango";
        sortAndConcate(str);
    }
}