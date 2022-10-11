package com.benjamin;

import java.util.Collections;
import java.util.List;
//
//12
//34
//
//12
//43
//
//42
//13

public class FlippingTheMatrix {
    public static int flippingMatrix(List<List<Integer>> arr) {

        int size = arr.size();
        int result = 0;
        for (int i = 0; i < (size /2) ; i++) {
            for (int j = 0; j < (size/2) ; j++) {
                int value = arr.get(i).get(j); // gets the value for each index in quad 1. Need to compare in all
                // valid index values.
                System.out.println("First value in each index " + value);
                value = Integer.max(value, arr.get(i).get(size - 1 - j));
                value = Integer.max(value, arr.get(size  -1 - i).get(j));
                value = Integer.max(value, arr.get(size -1 - i).get(size - 1 - j));
                result += value;
            }
        }
        System.out.println(result);
        return result;
    }
}