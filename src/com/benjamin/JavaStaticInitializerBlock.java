package com.benjamin;

import java.util.Scanner;

public class JavaStaticInitializerBlock {

    public static void scanNext() {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int B = scanner.nextInt();
            int H = scanner.nextInt();
            if(B <= 0 || H <= 0 ){
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            } else {
                int result = B*H;
                System.out.println(result);
            }
        }
        scanner.close();
    }
}
