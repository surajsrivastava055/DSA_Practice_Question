package StringProblems;

import java.util.HashMap;

// Find Frequency of charcter
public class Solution10 {

    public static void countFrequency(String str) {

        if (str == null || str.isEmpty()) {
            System.out.println("String is empty or null");
            return;
        }

        HashMap<Character, Integer> data = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            data.put(ch, data.getOrDefault(ch, 0) + 1);
        }
        System.out.println(data);
    }

    public static void main(String[] args) {
        String str = "Hellokyseho";
        countFrequency(str);
    }
}
