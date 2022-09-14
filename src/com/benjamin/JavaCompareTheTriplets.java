package com.benjamin;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class JavaCompareTheTriplets {

    public static void start() {

        List<Integer> a = new ArrayList<>() {{
            add(17);
            add(28);
            add(30);
        }};


        List<Integer> b = new ArrayList<>() {{
            add(99);
            add(16);
            add(8);
        }};

        compareTriplets(a, b);

    }


    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int pointA = 0;
        int pointB = 0;
        List<Integer> c = new ArrayList<>();
        c.add(0,0);
        c.add(1,0);
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).equals(b.get(i))) {
            } else if (a.get(i) > b.get(i)) {
                pointA++;
                c.set(0, pointA);
                System.out.println("a is greater than b " + c);
            } else {
                pointB++;
                c.set(1, pointB);
                System.out.println("b is greater than a " + c);
            }
        }
        System.out.println(c);
        return c;
    }


}