package com.benjamin;
// the  hackerrank way
//public static void main(String[] args) {
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//        Scanner scanner = new Scanner(System.in);
//        int n = 0;
//        n = scanner.nextInt();
//        solution(n);
//        }
public class IfElse {

    public static boolean solution(int num){
        if(num % 2 >= 1) {
            System.out.println("Weird");
           return true;
        } else if( num >=2 && num <=5 ){
            System.out.println("Not Weird");
        } else if ( num >=6 && num <=20 ){
            System.out.println("Weird");
        } else {
            System.out.println( "Not Weird");
        }
        return false;
    }
}
