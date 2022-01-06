package com.benjamin;

public class ExistsHigherNumber {
    public static boolean existsHigher(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= n) {  //cycle thru the array and compare to n
                return true;
            }
        }
        return false;
    }
}