package com.benjamin;

import java.util.Locale;
import java.util.Scanner;

public class CamelCase4 {

    //add a while loop scan.hasNextLine();

    public static Scanner scanner = new Scanner(System.in);
    public static StringBuilder sb;

    public static void convert() {
        System.out.println("Please enter data: ");
        String inputString = scanner.nextLine();
        sb = new StringBuilder(inputString);
        selection1(sb);
    }

    public static void selection1(StringBuilder sb) {
        switch (sb.substring(0, 3)) {
            case "S;M":
            case "S;V":
            case "S;C":
                splitConvert();
                break;
        }
    }

    public static void splitConvert() {
        sb.delete(0, 4);
        if (sb.charAt(sb.length() - 1) == ')' && sb.charAt(sb.length() - 2) == '(') {
            sb.delete(sb.length() - 2, sb.length());
        }
        if (Character.isUpperCase(sb.charAt(0))) {
            sb.setCharAt(0, Character.toLowerCase(sb.charAt(0)));
        }
        String newString = sb.toString();
        int counter = 0;
        StringBuilder newString2 = new StringBuilder(newString);
        for (int i = 0; i < newString.length(); i++) {
            if (Character.isUpperCase(newString.charAt(i))) {
                newString2.insert(i + counter , ' ');
                counter++;
            }
        }
        String newString3 = newString2.toString().toLowerCase(Locale.ROOT);
        System.out.println(newString3);
    }

}



