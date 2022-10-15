package com.benjamin;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;

public class CountingValleys {

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int count = 0;
        int numOfValleys = 0;
        for (int i = 0; i < steps; i++) {
            if (path.charAt(i) == 'D') {
                count--;
                System.out.println("D " + count);
            } else {
                count++;
                if (count == 0) {
                    numOfValleys++;
                }
                System.out.println("U " + count);
            }
        }
        System.out.println(numOfValleys);
        return numOfValleys;
    }
}

//
//    int count = 0;
//    int numOfValleys = 0;
//        for (int i = 0; i < steps; i++) {
//        if (path.charAt(i) == 'U') {
//        if (count == -1) {
//        numOfValleys++;
//        }
//        count++;
//        }
//        if (path.charAt(i) == 'D') {
//        count--;
//        }
//        }
//        return numOfValleys;
//        }
//        }