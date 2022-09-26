package com.benjamin;

import java.util.*;

public class DivisbleSumPairs {

    public static void divisibleSumPairs(int n, int k, List<Integer> ar) {


        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.println(ar.get(i) + " " + ar.get(j));
                if ( ((ar.get(i) + ar.get(j)))% k == 0 ) {
                    System.out.println((ar.get(i) +  " " + ar.get(j)));
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}