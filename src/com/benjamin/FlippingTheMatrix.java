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
    public static void flippingMatrix(List<List<Integer>> arr) {
        Collections.sort(arr.get(0));
        Collections.sort(arr.get(1));
        System.out.println(arr);

    }
}