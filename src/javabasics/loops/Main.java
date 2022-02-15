package javabasics.loops;

public class Main {
    public static void main(String[] args) {
        SumThreeFiveChallenge.Sum();
        System.out.println("======================================");

        //sum of odds on range challenge ---
        System.out.println(SumOddChallenge.sumOdd(1,100));
        System.out.println(SumOddChallenge.sumOdd(-1,100));
        System.out.println("======================================");

        //palindrome number check
        System.out.println(NumberPalindrome.isPalindrome(181));
        System.out.println(NumberPalindrome.isPalindrome(185));
        System.out.println("======================================");

        //sum of first and last digit of a number
        System.out.println(FirstAndLastDigitSum.sumFirstAndLastDigit(5));
    }
}
