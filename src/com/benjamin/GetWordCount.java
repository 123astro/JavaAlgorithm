package com.benjamin;

public class GetWordCount {
    public static int countWords(String s) {
        int count = 0;
        for (String wCount : s.split(" ")) {
            count++;
        }
        return count;
    }
}
