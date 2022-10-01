package com.benjamin;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class JavaAnagrams {
    static boolean isAnagram(String a, String b) {
 // added stuff : )
        Map<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < a.length(); i++) { //iterate thru all of a list.
            a = a.toLowerCase(Locale.ROOT);
            char x = a.charAt(i);

            if (!map1.containsKey(x)) {  // adds element from list to hashmap and adds a value of 1 count.
                map1.put(x, 1);
            } else {
                map1.put(x, map1.get(x) + 1); // add + 1  to an element that already has a value
            }
        }
        System.out.println(map1);
        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < b.length(); i++) { //iterate thru all of a list.
            b = b.toLowerCase(Locale.ROOT);
            char x = b.charAt(i);
            if (!map2.containsKey(x)) {  // adds element from list to hashmap and adds a value of 1 count.
                map2.put(x, 1);
            } else {
                map2.put(x, map2.get(x) + 1); // add + 1  to an element that already has a value
            }
        }
        System.out.println(map2);
        System.out.println(map1.size());
        System.out.println(map2.size());
        if (map1.size() == map2.size()) {
            if (map1.equals(map2)) {
                System.out.println("Anagrams");
                return true;
            } else {
                System.out.println("Not Anagrams");
                return false;
            }
        }
        System.out.println("Not Anagrams");
        return false;
    }
}

