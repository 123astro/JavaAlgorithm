package com.benjamin;

import java.util.ArrayList;
import java.util.List;

public class BreakingTheRecords {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int minScoreCounter = 0;
        int maxScoreCounter = 0;
        int minScore = 0;
        int maxScore = 0;
        int totalCount = 0;
        List<Integer> result = new ArrayList<>(){{add(0); add(0);}};
        for (int i = 0; i < scores.size(); i++) {
            if (maxScore == 0 &&  minScore == 0 && totalCount ==0) {
                minScore = scores.get(i);
                maxScore = scores.get(i);
                System.out.println(minScore + " min");
                System.out.println(maxScore + " max");
                totalCount++;
            } else
            if  (maxScore < scores.get(i)) {
                maxScore = scores.get(i);
                maxScoreCounter++;
                System.out.println(maxScoreCounter);
                result.set(0, maxScoreCounter);
            } else if (minScore > scores.get(i)) {
                minScore = scores.get(i);
                minScoreCounter += minScoreCounter;
                result.set(1, minScoreCounter);
                System.out.println(minScore + " min");
            }
        }
        System.out.println(result);
    return result;
    }
}