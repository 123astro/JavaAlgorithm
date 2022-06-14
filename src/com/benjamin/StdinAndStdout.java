package com.benjamin;

import java.util.Scanner;

public class StdinAndStdout {

    public static boolean solution() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int num = 0;
        while (count < 3) {
            num = scanner.nextInt();

            System.out.println(num);
            count++;
        }
        return false;
    }

}

