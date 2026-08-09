package CommonCodingQuestions;

//Q #2) Write a Java Program to swap two numbers without using the third variable.
public class SwapTwoNumber_2 {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        /*
         * with third variable
         * int temp=a;
         * a=b;
         * b=temp;
         */

        // without third variable
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a:" + a + ", b:" + b);
    }

}
