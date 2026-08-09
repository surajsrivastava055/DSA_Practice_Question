package CommonCodingQuestions;
// Q #1) Write a Java Program to reverse a string without using String inbuilt function.

// i/p -> Gyan
// o/p -> nayG

class ReverseString_1 {

    public static String reverseString(String str) {

        if (str == null || str == "") {
            return "Invalid String";
        }

        char arr[] = str.toCharArray();

        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            char ch = arr[start];
            arr[start++] = arr[end];
            arr[end--] = ch;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String str = "Gyan";
        System.out.println(reverseString(str));
    }
}