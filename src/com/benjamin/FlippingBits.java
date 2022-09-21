package com.benjamin;

public class FlippingBits {

    public static void flippingBits(long n) {
        // Write your code here
        String result = String.format("%4d", 42949672);
        System.out.println(result);
        //System.out.printf('%032b', 4294967294);
        String bin = Long.toBinaryString(n);
        StringBuilder newBin = new StringBuilder();
        for(Character binNum : bin.toCharArray()) {
            if(binNum == '0'){
                newBin.append("1");
            } else {
                newBin.append("0");
            }
            System.out.print(binNum);
        }
        System.out.print("\n" + newBin);
        String x = Long.toBinaryString(n);
       // System.out.println(Long.parseLong(String.valueOf(())));

    }

}
