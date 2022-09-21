package com.benjamin;

import java.util.ArrayList;
import java.util.List;

public class BreakingTheRecords {
    public static List<Integer> breakingRecords(List<Integer> scores) {
//        // Write your code here
//        int minScoreCounter = 0;
//        int maxScoreCounter = 0;
//        int minScore = 0;
//        int maxScore = 0;
//        int totalCount = 0;
//
//        List<Integer> result = new ArrayList<>(){{add(0); add(0);}};
//        for (int i = 0; i < scores.size(); i++) {
//            if (maxScore == 0 &&  minScore == 0 && totalCount ==0) {
//                minScore = scores.get(i);
//                maxScore = scores.get(i);
//                totalCount++;
//            } else
//            if  (maxScore < scores.get(i)) {
//                maxScore = scores.get(i);
//                maxScoreCounter++;
//                result.set(0, maxScoreCounter);
//            } else if (minScore > scores.get(i)) {
//                minScore = scores.get(i);
//                minScoreCounter ++;
//                result.set(1, minScoreCounter);
//            }
//        }
//        System.out.println(result);
//    return result;
//    }
//}

        int minScoreCounter = 0;
        int maxScoreCounter = 0;
        int minScore = scores.get(0);
        int maxScore = scores.get(0);

        List<Integer> result = new ArrayList<>() {{
            add(0);
            add(0);
        }};

        for (int i = 1; i < scores.size(); i++) {
            if (maxScore < scores.get(i)) {
                result.set(0, scores.get(i));
                maxScore = scores.get(i);
                maxScoreCounter++;
            } else if (minScore > scores.get(i)) {
                result.set(1, scores.get(i));
                minScore = scores.get(i);
                minScoreCounter++;
            }
        }
        result.set(0, maxScoreCounter);
        result.set(1, minScoreCounter);
        System.out.println(result);
        return result;
    }
}

//        int minScoreCounter = 0;
//        int maxScoreCounter = 0;
//
//        List<Integer> result = new ArrayList<>() {{
//            add(0);
//            add(0);
//        }};
//
//        for (int i = 1; i < scores.size(); i++) {
//            if (result.get(i) < scores.get(i)) {
//                result.add(0, scores.get(i));
//                maxScoreCounter++;
//            } else if (result.get(i) > scores.get(i)) {
//                result.add(1, scores.get(i));
//                minScoreCounter++;
//            }
//        }
//        result.set(0, maxScoreCounter);
//        result.set(1, minScoreCounter);
//        System.out.println(result);
//        return result;
//    }
//}