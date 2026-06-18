package ArrayProblems;

import java.util.HashSet;

public class Solution14 {

    // Problem: Find the union of element
    // i/p -> {1,2,3,4,5}
    // i/p -> {1,4,6,7,8}
    // o.p -> {1,2,3,4,5,6,7,8}

    static void findUnionOfElement(int arr[], int arr1[]) {
        HashSet<Integer> data = new HashSet<>();
        for (int element : arr) {
            data.add(element);
        }
        for (int element : arr1) {
            data.add(element);
        }

        for (int element : data) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 10, 54, 9, 12, 10, 10, 9, 12, 54, 10 };
        int arr[] = { 10, 12, 87, 67, 9 };
        findUnionOfElement(arr1, arr);

    }
}