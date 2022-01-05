package com.benjamin;

public class HowManyVowels {
    public static int getCount(String str) {
        int vowelsCount = 0;
        // Your code here
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);  // charAt returns a character at a specified index
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }
}
