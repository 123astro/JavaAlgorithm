package com.benjamin;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class ConvertIntToString {

    public static void intConvert(int n) {

        String s = String.valueOf(n);
        try {
            if (n >= -100 && n <= 100){
            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            }
            } else {
                System.out.println("Wrong answer");
            }
        } catch (Exception e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}