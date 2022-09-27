package com.benjamin;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountinSort1 {

    public static List<Integer> countingSort(List<Integer> arr) {


//        List<Integer> result = new ArrayList<>();
//        for (int i = 0; i < arr.size(); i++) { result.add(0);
//        }
//        for (int num : arr) {
//            System.out.println(result.get(num) + 1);
//            result.set(num, result.get(num) + 1);
//        }
//        System.out.println(result);
//        return result;
//    }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            result.add(0);
        }
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            result.set(num, result.get(num) + 1);
        }
        System.out.println(result);
        return result;
    }
}