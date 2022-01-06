package com.benjamin;




public class Main {

    public static void main(String[] args) {
        System.out.println("Get the first Element: " + GetFirstElement.getFirstValue(new int[]{1, 2, 3, 4}));
        System.out.println("Find the index: " + FindTheIndex.search(new int[]{1, 2, 3, 4}, 4));
        System.out.println(("Next Number is: " + NextNumber.addition(2)));
        System.out.println("Return the sum: " + ReturnSumOf2Num.sum(3, 2));
        System.out.println("Min to seconds: " + MinToSec.convert(6));
        System.out.println(ReturnSomethingToMe.giveMeSomething("keith b"));
        System.out.println("Flip the boolean: " + FlipTheBoolean.reverse(false));
        System.out.println(GetWordCount.countWords("John is dead"));
        System.out.println("Is there a higher number than the variable entered?  " + ExistsHigherNumber.existsHigher(new int[]{10, 3, 5, 2, 4}, 10));
        System.out.println(HowManyVowels.getCount("Celebration"));
        System.out.println(ReturnTheSumOfTwoNums.sum(3,2));
        System.out.println(AreNumbersEqual.isSameNum(3,4) );
        System.out.println(NameGreeting.helloName("Keith"));
        System.out.println(ReverseTheOrderOfString.reverse("Keith"));
    }
}
