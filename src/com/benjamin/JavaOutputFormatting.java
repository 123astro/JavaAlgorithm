package com.benjamin;

import java.util.Scanner;

public class JavaOutputFormatting {

    public static boolean solution() {
        repeatedEquals();
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        for (int i = 0; i < 3; i++) {
            String text = scanner.next();
            int num = scanner.nextInt();
            System.out.printf("%-15s%03d%n", text, num);
        }
        repeatedEquals();
        return false;
    }
    public static void repeatedEquals(){
        String str = "=";
        String repeated = str.repeat(32);
        System.out.println(repeated);
    }
}
