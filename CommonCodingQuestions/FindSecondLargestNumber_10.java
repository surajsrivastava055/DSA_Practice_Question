package CommonCodingQuestions;

// Q #10) Write a Java Program to find the second-highest number in an array.
public class FindSecondLargestNumber_10 {

    public static void findSecondLargestNumber(int arr[]) {
        if (arr == null || arr.length < 2) {
            System.out.println("Array don't cpntain second number");
            return;
        }
        int fLargest = Integer.MIN_VALUE, sLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > fLargest) {
                sLargest = fLargest;
                fLargest = arr[i];
            } else if (arr[i] > sLargest && arr[i] != fLargest) {
                sLargest = arr[i];
            }
        }
        if (sLargest == Integer.MIN_VALUE) {
            System.out.println("Array don't contain second Largest");
        } else {
            System.out.println(sLargest);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        findSecondLargestNumber(arr);
    }

}
