package CommonCodingQuestions;

import java.util.HashMap;
import java.util.Map;

//Q #9) Write a Java Program to find the duplicate characters in a string.
public class DuplicateCharacterInString_9 {

    public static void duplicateCharacter(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        for (Map.Entry<Character, Integer> data : map.entrySet()) {
            if (data.getValue() > 1) {
                System.out.println(data.getKey() + " appears " +
                        data.getValue() + " times");
            }
        }
    }

    public static void main(String[] args) {
        String str = "Hellogyangyaaaan";
        duplicateCharacter(str);
    }
}
