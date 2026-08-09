package StringProblems;

// Problem: Remove all occurrences of a substring
// Link: https://leetcode.com/problems/remove-all-occurrences-of-a-substring/description/

/* Description: 
Given two strings s and part, perform the following operation on s until all occurrences of the substring
part are removed:

Find the leftmost occurrence of the substring part and remove it from s.
Return s after removing all occurrences of part.

A substring is a contiguous sequence of characters in a string.
*/
public class Solution15 {

    public static String removeOccurrences(String s, String part) {
        while (s.contains(part)) {
            int index = s.indexOf(part);
            s = s.substring(0, index) + s.substring(index + part.length());
        }
        return s;
    }

    public static void main(String[] args) {
        String str = "daabcbaabcbc";
        String part = "abc";
        System.out.println(removeOccurrences(str, part));
    }

}
