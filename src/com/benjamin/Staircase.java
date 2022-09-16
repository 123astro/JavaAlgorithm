package com.benjamin;

public class Staircase {

    public static void staircase(int n) {
        // Write your code here
        for(int i = 0; i < n; i++){
            System.out.println("#");
            for (int j = 0; j < n; j++)
                System.out.println('\n');
        }

    }
}
