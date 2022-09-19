package com.benjamin;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class CamelCase4 {

    public static Scanner scanner = new Scanner(System.in);


    public static void convert() {
        String newString2 = "";
        System.out.println("Please enter data: ");
        String inputString = scanner.nextLine();
        StringBuilder sb = new StringBuilder(inputString);
        selection(inputString);
        if (inputString.charAt(0) == 'S') {
            sb.delete(0, 4);
            sb.delete(sb.length() - 2, sb.length());
            String newString = sb.toString();
            for (int i = 0; i < newString.length(); i++) {
                if (Character.isUpperCase(newString.charAt(i))) {
                    newString2 = newString.replaceAll("([A-Z])", " ");
                }
            }

            System.out.println(newString2);
        } else {

        }
    }
//
//    } else
//
//    {
//        System.out.println("combine");
//    }

//
    public static void selection(String inputString) {

        switch (inputString.charAt(2)) {
            case 'M':
                methodConvert();
                break;
            case 'V':
                varConvert();
                break;
            case 'C':
                classConvert();
        }
    }

        public static void methodConvert () {

            System.out.println("methodConvert");
        }

        public static void classConvert () {
            System.out.println("classConvert");
        }

        public static void varConvert () {
            System.out.println("var convert");

        }

    }



