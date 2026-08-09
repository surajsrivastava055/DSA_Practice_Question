package CommonCodingQuestions;

import java.util.HashMap;
import java.util.Map;

/**
 * CountWordsInString
 */
// Q #3) Write a Java Program to count the number of words in a string using
// HashMap.
public class CountWordsInString_3 {

    public static void countWords(String str) {

        String arr[] = str.split("\\s+");

        HashMap<String, Integer> map = new HashMap<>();
        for (String ob : arr) {
            map.put(ob, map.getOrDefault(ob, 0) + 1);
        }

        for (Map.Entry<String, Integer> ob : map.entrySet()) {
            System.out.println(ob.getKey() + "->" + ob.getValue());
        }

    }

    public static void main(String[] args) {
        String str = "Hi I am gyan chandra shrivastava I am I";
        countWords(str);
    }
}