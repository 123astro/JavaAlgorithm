package com.benjamin;

//In order to work properly, the function should replace all "a"s with 4, "e"s with 3,
// "i"s with 1, "o"s with 0, and "s"s with 5.

public class HackerSpeak {
    public static String hackerSpeak(String str) {
        String str1 = str.replace('a', '4');
        String str2 = str1.replace('e', '3');
        String str3 = str2.replace('i', '1');
        String str4 = str3.replace('o', '0');
        String str5 = str4.replace('s', '5');
        return str5;
    }
}
