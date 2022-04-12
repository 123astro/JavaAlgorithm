package com.benjamin;

import java.text.NumberFormat;
//
//public class FindTheDiscount {
//    public static String discount(double price, int percentage) {
//        double amount = price - (price * percentage / 100);
//        NumberFormat formatter = NumberFormat.getCurrencyInstance();
//        return formatter.format(amount);
//    }
//}

public class FindTheDiscount {
    public static double discount(int price, int percentage) {
        return price - ((double)price * percentage / 100);
    }
}

