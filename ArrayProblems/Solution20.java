package ArrayProblems;

//Two Sum problem
public class Solution20 {

    static void findTwoSum(int arr[], int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("{" + i + ", " + j + "}");
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 4, 6, 8, 3, 7, 4, 7 };
        int target = 10;
        findTwoSum(arr, target);
    }

}
