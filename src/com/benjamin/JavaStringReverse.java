package com.benjamin;

public class JavaStringReverse {

    public class Solution {


        public static void palinsrome(String A) {
            /* Enter your code here. Print output to STDOUT. */
            StringBuilder sb = new StringBuilder();
            for (int i = A.length() - 1; i > -1; i--) {
                sb.append(A.charAt(i));
            }
            String newString = sb.toString();
            if (newString.equals(A)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}