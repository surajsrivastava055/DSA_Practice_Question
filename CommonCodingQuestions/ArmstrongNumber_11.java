package CommonCodingQuestions;

//Q #11) Write a Java Program to check Armstrong number.
public class ArmstrongNumber_11 {

    public static void armstrongNumber(int num) {
        if (num < 0) {
            System.out.println("Invalid Number");
            return;
        }

        int originalNumber = num;
        int sum = 0;
        int digit = String.valueOf(num).length();
        while (num != 0) {
            int rem = num % 10;
            sum = sum + (int) Math.pow(rem, digit);
            num = num / 10;
        }
        if (originalNumber == sum) {
            System.out.println("Number is Armstrong");
        } else {
            System.out.println("Number is Not Armstrong");
        }
    }

    public static void main(String[] args) {

        int num = 157;
        armstrongNumber(num);

    }
}
