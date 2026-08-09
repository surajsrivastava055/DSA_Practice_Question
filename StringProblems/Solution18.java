package StringProblems;

//Problem: String Compression
//Link: https://leetcode.com/problems/string-compression/description/
/* Description:
Given an array of characters chars, compress it using the following algorithm:

Begin with an empty string s. For each group of consecutive repeating characters in chars:

If the group's length is 1, append the character to s.
Otherwise, append the character followed by the group's length.
The compressed string s should not be returned separately, but instead, be stored in the input character
array chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.

After you are done modifying the input array, return the new length of the array.

You must write an algorithm that uses only constant extra space.

Note: The characters in the array beyond the returned length do not matter and should be ignored.
*/
public class Solution18 {

    public static int compress(char[] chars) {
        int readIndex = 0;
        int writeIndex = 0;
        while (readIndex < chars.length) {
            int currentCharacterIndex = readIndex;
            int count = 0;
            while (readIndex < chars.length && chars[currentCharacterIndex] == chars[readIndex]) {
                count++;
                readIndex++;
            }
            // now I have currentCharacter and count of that character now insert it into
            // char array
            chars[writeIndex++] = chars[currentCharacterIndex];
            if (count > 1) {
                String s = Integer.toString(count);
                for (int i = 0; i < s.length(); i++) {
                    chars[writeIndex++] = s.charAt(i);
                }
            }
        }
        return writeIndex;
    }

    public static void main(String[] args) {
        char chars[] = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
        System.out.println(compress(chars));

    }
}
