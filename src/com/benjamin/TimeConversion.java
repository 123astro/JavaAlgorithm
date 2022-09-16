package com.benjamin;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
import java.util.Locale;

//public class TimeConversion {
//    public static String timeConversion(String s) throws ParseException {
//        // Write your code here
//
//        SimpleDateFormat date12Format= new SimpleDateFormat("hh:mm:ssa");
//        SimpleDateFormat date24Format = new SimpleDateFormat("HH:mm:ss");
//
//            System.out.println(date24Format.format(date12Format.parse(s)));
//
//        return "done";
//    }
//}

public class TimeConversion {
    public static String timeConversion(String s) {
        // Write your code here

        SimpleDateFormat date12Format= new SimpleDateFormat("hh:mm:ssa");
        SimpleDateFormat date24Format = new SimpleDateFormat("HH:mm:ss");


        return "done";
    }
}

