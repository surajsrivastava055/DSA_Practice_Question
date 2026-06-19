package ArrayProblems;

//Three Sum problem
public class Solution21 {

    static void findThreeSum(int arr[], int target) {
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        System.out.println("{" + i + ", " + j + ", " + k + "}");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 4, 6, 8, 3, 7, 4, 7 };
        int target = 14;
        findThreeSum(arr, target);
    }

}
