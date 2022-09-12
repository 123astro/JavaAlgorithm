package com.benjamin;

import java.util.*;
import java.text.*;
import java.util.Scanner;

public class JavaCurrencyFormatter {
    public static void solution() {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat usInstance = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat chinaInstance = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceIns = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat indiaIns = NumberFormat.getCurrencyInstance(new Locale("en", "in"));


        // Write your code here.
        System.out.println("US: " + usInstance.format(payment));
        System.out.println("India: " + indiaIns.format(payment));
        System.out.println("China: " + chinaInstance.format(payment));
        System.out.println("France: " + franceIns.format(payment));
    }
}