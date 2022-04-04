package com.benjamin;

import java.text.NumberFormat;

public class FindTheDiscount {
    public static String discount(double price, int percentage) {
        double amount = price - (price * percentage / 100);
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String amountString = formatter.format(amount);
        return amountString;
    }
}

