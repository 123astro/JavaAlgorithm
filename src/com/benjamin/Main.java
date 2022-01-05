package com.benjamin;



public class Main {

    public static void main(String[] args) {
        System.out.println("testing");
        System.out.println(GetFirstElement.getFirstValue(new int[]{1, 2, 3, 4}));
        System.out.println((NextNumber.addition(2)));
        System.out.println(ReturnSumOf2Num.sum(3, 2));
        System.out.println(MinToSec.convert(6));
        System.out.println(ReturnSomethingToMe.giveMeSomething("keith b"));
        System.out.println(FlipTheBoolean.reverse(false));
        System.out.println(GetWordCount.countWords("John is dead"));
        System.out.println(ExistsHigherNumber.existsHigher(new int[]{10, 3, 5, 2, 4}, 10));
        System.out.println(HowManyVowels.getCount("Celebration"));
        System.out.println(ReturnTheSumOfTwoNums.sum(3,2));
        System.out.println(AreNumbersEqual.isSameNum(3,4) );
        System.out.println(NameGreeting.helloName("Keith"));
    }
}
