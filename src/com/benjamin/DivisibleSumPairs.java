package com.benjamin;

import java.util.*;

public class DivisibleSumPairs {

    public static void divisibleSumPairs(int n, int k, List<Integer> ar) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            int count2 = 0;
            for (int j = i + 1; j < n; j++) {
                count2++;
                System.out.println("Count:" + count2 + " " + ar.get(i) + "+" + ar.get(j));
                if ( ((ar.get(i) + ar.get(j)))% k == 0 ) {
                    System.out.println(( ar.get(i) + " + " + ar.get(j) + " = " + k));
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}