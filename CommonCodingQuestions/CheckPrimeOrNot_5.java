package CommonCodingQuestions;

//Q #5) Write a Java Program to find whether a number is prime or not in the most efficient way?
public class CheckPrimeOrNot_5 {

    public static String checkPrimeNumber(int num) {
        if (num <= 1) {
            return "Number is Not Prime";
        }
        if (num <= 3) {
            return "Number is Prime";
        }
        boolean isPrime = true;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            return "Number is Prime";
        } else {
            return "Number is not prime";
        }
    }

    public static void main(String[] args) {
        int number = 4;
        System.out.println(checkPrimeNumber(number));
    }

}
