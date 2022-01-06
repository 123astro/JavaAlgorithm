package com.benjamin;

import java.lang.*;

public class ReverseTheOrderOfString {
    //    public static StringBuilder reverse(final String str) {
//        StringBuilder newStr = new StringBuilder(str);
//       return newStr.reverse();
//    }
//}
    public static String reverse(final String str) {
        char ch = 0;
        String revString = "";
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
        revString = ch + revString;
        }
        return revString;
    }
}
