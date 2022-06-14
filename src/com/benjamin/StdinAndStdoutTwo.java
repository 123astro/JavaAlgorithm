package com.benjamin;

import java.util.Scanner;

public class StdinAndStdoutTwo {

        public static boolean solution( ) {
            Scanner scanner = new Scanner(System.in);
            int numI = scanner.nextInt();
            double numD = scanner.nextDouble();
            scanner.nextLine();
            String text = scanner.nextLine();
            System.out.println("String: " + text);
            System.out.println("Double: " + numD);
            System.out.println("Int: " + numI);
            return false;
        }

    }



