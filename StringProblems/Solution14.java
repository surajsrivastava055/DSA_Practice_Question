package StringProblems;

//Problem: Replace all occurrences of a string with space
// Link: https://www.geeksforgeeks.org/dsa/replace-all-occurrences-of-a-string-with-space/
/* Description:
Given a string and a substring, the task is to replace all occurrences of the substring with space.
We also need to remove trailing and leading spaces created due to this.

Input: str = "LIELIEILIEAMLIECOOL", sub = "LIE" 
Output: I AM COOL By replacing all occurrences of Sub in Str with empty spaces,
we extract the secret message as I AM COOL.
*/
public class Solution14 {

    public static String replaceSubStringWithSpace(String str, String sub) {
        if (sub.length() > str.length()) {
            return "Invalid String";
        }

        StringBuilder sb = new StringBuilder(str);
        while (sb.indexOf(sub) != -1) {
            int index = sb.indexOf(sub);
            sb.delete(index, index + sub.length());

            // need to add space after index
            sb.insert(index, " ");
        }
        String result = sb.toString().trim();
        return result;
    }

    public static void main(String[] args) {
        String str = "LIELIEILIEAMLIECOOL";
        String sub = "LIE";
        System.out.println(replaceSubStringWithSpace(str, sub));
    }

}
