package com.benjamin;

import java.util.List;

public class PlusMinusHacker {

    public static void plusMinus(List<Integer> arr) {
        float pos = 0;
        float neg = 0;
        float zero = 0;
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) == 0){
                zero++;
                continue;
            }
            if(arr.get(i) >= 1){
                pos++;
            } else {
                neg++;
            }
        }
        System.out.printf("%.6f%n", pos/arr.size());
        System.out.printf("%.6f%n", neg/arr.size());
        System.out.printf("%.6f%n", zero/arr.size());
    }
}
