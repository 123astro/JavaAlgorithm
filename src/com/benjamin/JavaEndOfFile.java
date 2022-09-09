package com.benjamin;

import java.util.Scanner;

public class JavaEndOfFile {

    public static void scanNext() {
        Scanner scanner = new Scanner(System.in);

        int count = 1;
        while (scanner.hasNext()) {
            String STDOUT = scanner.nextLine();
            System.out.println(count + " " + STDOUT);
            count++;
        }
        //Close the scanner
        scanner.close();
    }
}



