package com.benjamin;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapPractice {

    public static int freqCount(List<Integer> a) {
        Map<Integer, Integer> map = new HashMap<>();
        //freq counter
        for (Integer element : a) { //iterate thru all of a list.
            if (!map.containsKey(element)) {  // adds element from list to hashmap and adds a value of 1 count.
                map.put(element, 1);
            } else {
                map.put(element, map.get(element) + 1); // add + 1  to an element that already has a value
            }
        }

//        for(Object value : map.values())
//            System.out.println(value);

        for (var entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                return entry.getKey();
            }
        }
        return 0;
    }


//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            if (entry.getValue() == 1) {
//                System.out.println(entry.getKey());
//                return entry.getKey();
//            }
//        }
//        return 0;
//    }
}