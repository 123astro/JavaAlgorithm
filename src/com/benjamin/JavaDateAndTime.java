package com.benjamin;


import java.util.Calendar;

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
        String[] days = new String[]{"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1 , day);
        System.out.println(days[(calendar.get(Calendar.DAY_OF_WEEK) -1 )]);
        // minus ones are because Jan is month 0 and Dec is month 11, same logic for days.
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
