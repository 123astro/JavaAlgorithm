package com.benjamin;

import java.util.Locale;
import java.util.Scanner;
//input
//S;M;plasticCup()
// C;V;mobile phone
// C;C;coffee machine
//S;C;LargeSoftwareBook
//C;M;white sheet of paper
//S;V;pictureFrame

//output
//plastic cup
//mobilePhone
//CoffeeMachine
//large software book
//whiteSheetOfPaper()
//picture frame

public class CamelCase4 {

    //add while loop scan.hasNextLine();

      public static Scanner scanner = new Scanner(System.in);
    public static StringBuilder sb;



    public static void convert() {
        while (scanner.hasNextLine()) {
            System.out.println("Please enter data: ");
            String inputString = scanner.nextLine();
            sb = new StringBuilder(inputString);
            selection1(sb);
        }
    }

    public static void selection1(StringBuilder sb) {
        switch (sb.substring(0, 3)) {
            case "S;M", "S;V", "S;C" -> split();
            case "C;C", "C;V", "C;M" -> combine();
        }
    }

    public static String split() {
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
                newString2.insert(i + counter, ' ');
                counter++;
            }
        }
        String newString3 = newString2.toString().toLowerCase(Locale.ROOT);
        System.out.println(newString3);
        return newString3;
    }

    public static void combine() {
        if (sb.charAt(2) == 'C') {
            sb.setCharAt(4, Character.toUpperCase(sb.charAt(4)));
        }
        if (sb.charAt(2) == 'M') {
            sb.append('(');
            sb.append(')');
        }
        sb.delete(0, 4);
        String newString3 = null;
        String newString = sb.toString();
        System.out.println(newString);
        StringBuilder newString2 = new StringBuilder(newString);
        for (int i = 0; i < newString.length(); ++i) {
            if (Character.isWhitespace(newString2.charAt(i))) {
                newString2.setCharAt(i + 1, newString.toUpperCase(Locale.ROOT).charAt(i + 1));
            }
        }
        int counter = 0;
        for (int i = 0; i < newString.length() - counter; ++i) {
            if (Character.isWhitespace(newString2.charAt(i))) {
                newString2.deleteCharAt(i);
                counter++;
            }
        }
        String newString4 = newString2.toString();
        System.out.println(newString4);
    }

}





