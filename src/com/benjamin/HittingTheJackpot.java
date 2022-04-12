package com.benjamin;

//assertThat(Challenge.testJackpot(new String[]{"@", "@", "@", "@"}), is(true));

import java.util.Objects;

public class HittingTheJackpot {
    public static boolean testJackpot(String[] result) {
        for (int i = 1; i < result.length; i++) {
            if (!Objects.equals(result[i], result[0])) {
                return false;
            }
        }
        return true;
    }
}