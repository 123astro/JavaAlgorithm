package com.benjamin;

import java.util.Locale;

public class Pangrams {
    public static String pangrams(String s) {
//        List<Character> letters = new ArrayList<>();
        boolean alphabetPresent = true;
//        for (int i = 0; i < s.length(); i++) {
//            letters.add(s.toLowerCase(Locale.ROOT).charAt(i));
//
//        }
//        System.out.println(letters);
        s = s.toLowerCase(Locale.ROOT);
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!s.contains(String.valueOf(ch))) {
                alphabetPresent = false;
                break;
            }

        }
        if (alphabetPresent) {
            System.out.println("pangram");
            return "pangram";
        } else {
            System.out.println("not pangram");
            return "not pangram";
        }
    }
}