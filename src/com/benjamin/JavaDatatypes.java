package com.benjamin;

import java.util.Scanner;

public class JavaDatatypes {
    public static void javaDataT() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers would you like to check?");
        int t = sc.nextInt();
        System.out.println((Math.pow(2, 31) -1 ));
        System.out.println(-(Math.pow(2, 31)));
        System.out.println( -(Math.pow(2, 63)));
        System.out.println( (Math.pow(2, 63) - 1));

        for (int i = 0; i < t; i++) {
            try {
                System.out.println("Please enter a number");
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127) System.out.println("* byte");
                if (x >= -32_768 && x <= 32_767) System.out.println("* short");
                if (x >= -2147483648  && x <= 2147483647 )System.out.println("* int");
                if (x >= -(Math.pow(2, 63)) && x <= (Math.pow(2, 63) - 1)) System.out.println("* long");
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }
}