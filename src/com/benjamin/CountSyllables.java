package com.benjamin;

public class CountSyllables {
    public static String numberSyllables(String word) {
        int count = 1;
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == '-') {
                count++;
            }
        }
        return "Number of Syllables: " + count;
    }
}
