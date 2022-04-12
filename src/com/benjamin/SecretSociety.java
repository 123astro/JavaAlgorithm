package com.benjamin;

import java.util.Arrays;

public class SecretSociety {
    public static String societyName(String[] friends) {
        String firstLetter = "";
        Arrays.sort(friends);
        for (int i = 0; i < friends.length; ++i) {
              firstLetter += friends[i].charAt(0);
        }
        return firstLetter ;
    }
}

