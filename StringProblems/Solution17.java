package StringProblems;

// Problem: Remove all adjacent duplicates in string
// Link: https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/description/
/* Description:
You are given a string s consisting of lowercase English letters. A duplicate removal consists of
choosing two adjacent and equal letters and removing them.

We repeatedly make duplicate removals on s until we no longer can.

Return the final string after all such duplicate removals have been made. It can be proven that
the answer is unique. 
 */
public class Solution17 {

    public static String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (sb.length() > 0 && s.charAt(i) == sb.charAt(sb.length() - 1)) {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "abbaca";
        System.out.println(removeDuplicates(str));
    }

}
