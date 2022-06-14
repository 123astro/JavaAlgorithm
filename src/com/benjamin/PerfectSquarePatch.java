package com.benjamin;

import java.util.Arrays;

public class PerfectSquarePatch {
    public static int[][] squarePatch(int n) {

        // n will determine the number of sub arrays
        // n will determine the number of elements in each sub array.
        // n will determine the element value in each sub array

        int numOfSubArr = n;
        int numOfSubArrElms = n;
        int valueOfElms = n;

        int [][] squareArray = new int[numOfSubArr][numOfSubArrElms];
        for (int i = 0; i < squareArray.length ; i++ ){

            for (int j = 0; j < squareArray[i].length ; j++ ) {
               squareArray[i][j] = valueOfElms;
            }
        }
        System.out.println(Arrays.deepToString(squareArray));
    return squareArray;

    }
}
