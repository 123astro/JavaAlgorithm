package com.benjamin;

public class Staircase {

    public static void staircase(int n) {
        int count = n;
        for (int i = 0; i < n; i++) {
            count--;
            String space = " ";
            String x = "#";
            System.out.print(space.repeat(count));
            System.out.println(x.repeat(i + 1));
        }
    }
}
