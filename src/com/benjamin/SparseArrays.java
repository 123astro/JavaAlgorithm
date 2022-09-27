package com.benjamin;

import java.util.*;
import java.util.stream.Collectors;

public class SparseArrays {

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {


        List<Integer> countMatch = new ArrayList<>();
        for (String query : queries) {
            countMatch.add(Collections.frequency(strings, query));
        }
        System.out.println(countMatch);
        return countMatch;

    }
}


