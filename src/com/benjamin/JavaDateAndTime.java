package com.benjamin;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class JavaDateAndTime {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     * int month, int day, int year
     */

    public static void findDay(int month, int day, int year) {
        String[] days = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, (month - 1), day);
        System.out.println(days[ calendar.get(Calendar.DAY_OF_WEEK)]);
    }


    public static String findDay2(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, (month - 1), day);

        switch (calendar.get(Calendar.DAY_OF_WEEK)) {
            case 1:
                System.out.println("SUNDAY");
                return "SUNDAY";
            case 2:
                System.out.println("MONDAY");
                return "MONDAY";
            case 3:
                System.out.println("TUESDAY");
                return "TUESDAY";
            case 4:
                System.out.println("WEDNESDAY");
                return "WEDNESDAY";
            case 5:
                System.out.println("THURSDAY");
                return "THURSDAY";
            case 6:
                System.out.println("FRIDAY");
                return "FRIDAY";
            case 7:
                System.out.println("SATURDAY");
                return "SATURDAY";
            default:
                return "SOMETHING WENT WRONG!";
        }


    }


}
