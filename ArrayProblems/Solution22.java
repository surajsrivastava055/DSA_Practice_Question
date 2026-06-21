package ArrayProblems;

//Remove Duplicates from Sorted Array
//Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each 
//unique element appears only once. The relative order of the elements should be kept the same.
//Consider the number of unique elements in nums to be k​​​​​​​​​​​​​​. After removing duplicates, return the number of unique elements k.
//The first k elements of nums should contain the unique numbers in sorted order. The remaining elements beyond index k - 1 can be ignored.

public class Solution22 {
    static void removeDuplicateAndReturnUniqueCount(int[] arr) {
        int i = 0, j = 1;
        while (j < arr.length - 1) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
                j++;
            } else {
                j++;
            }
        }
        System.out.println(i + 1);
        System.out.println("--------------------------------");
        for (int data : arr) {
            System.out.println(data);
        }

        // 2nd way not better
        // Set<Integer> data=new LinkedHashSet<>();
        // for(int i:nums){
        // data.add(i);
        // }
        // int i=0;
        // for(int j:data){
        // nums[i]=j;
        // i++;
        // }
        // return data.size();
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 2, 2, 3, 4, 5, 5, 5, 6, 6, 7, 8, 9, 9 };

        removeDuplicateAndReturnUniqueCount(arr);
    }

}
