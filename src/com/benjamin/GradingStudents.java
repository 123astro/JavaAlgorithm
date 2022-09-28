package com.benjamin;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> newGrades = new ArrayList<>();
        for (Integer grade : grades) {
            if (grade % 5 != 0 && grade > 34 ) {
                int y  = grade % 5;
                int num = 5 - y;
               if(num < 3) {
                   int x = (int) (5 * (Math.ceil(((double) grade / 5))));
                   newGrades.add(x);
               } else {
                   newGrades.add(grade);
               }
            } else{
                newGrades.add(grade);
            }
        }
        System.out.println(newGrades);
        return newGrades;
    }
}



