package com.benjamin;

import java.util.*;

public class LonelyInteger {
    public static int lonelyinteger(List<Integer> a) {
        Collections.sort(a);
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer element : a) {
            if (!map.containsKey(element)) {
                map.put(element, 1);
            } else {
                map.put(element, map.get(element)+1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {  // map.entrySet() is using the whole map
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                return entry.getKey();
            }

        }
        return 0;
    }

}

