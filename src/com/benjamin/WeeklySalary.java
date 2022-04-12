package com.benjamin;

public class WeeklySalary {

    public static int theWeeklySalary(int[] hours) {
        int totalPay = 0;

        for (int i = 0; i < hours.length; i++) {
            boolean isWeekend = i == 5 || i == 6;
            int numOfHours = hours[i];
            totalPay += getPayDay(numOfHours, isWeekend);

        }
        return totalPay;
    }

    public static int getPayDay(int hours, boolean isWeekend) {
        int payDay = 0;
        int extraHours = hours - 8;
        if (extraHours > 0 ){
            hours -= extraHours; //always equals 8
            payDay += extraHours * 15;
        }
        payDay += hours * 10;
        if(isWeekend) payDay *= 2;
        return payDay;
    }
}

//public class WeeklySalary {
//    public static int theWeeklySalary(int[] hours) {
//        int pay1 = 0;
//        int pay2 = 0;
//        int ot = 0;
//        for (int i = 0; i < hours.length; i++) {
//            if (hours[5] > 0 || hours[6] > 0) {
//                ot = ((hours[5] + hours[6]) * 2) * 10;
//                continue;
//            }
//            if (hours[i] > 8) {
//                pay2 += ((8 - hours[i]) * 15) + 80;
//            } else {
//                pay1 += hours[i] * 10;
//            }
//        }
//        return ot + pay1 + pay2;
//    }
//}