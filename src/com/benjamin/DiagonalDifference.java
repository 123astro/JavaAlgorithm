package com.benjamin;

import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int num = 0;
        int num2 = 0;
        for(int i = 0; i < arr.size(); i++){
            num += (arr.get(i).get(i));
            num2 += (arr.get(i).get(arr.size() - (1 + i)));
        }
        return Math.abs(num - num2);
    }
}