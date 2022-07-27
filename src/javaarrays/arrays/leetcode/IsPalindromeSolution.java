package javaarrays.arrays.leetcode;

import java.lang.*;

public class IsPalindromeSolution {

    public static void main(String[] args){
        IsPalindromeSolution isPalindromeSolution = new IsPalindromeSolution();
        System.out.println(isPalindromeSolution.isPalindrome(-121));
    }

    public boolean isPalindrome(int x){
        int tempValue = x;
        tempValue = Math.abs(tempValue);
        int reversedValue = 0;
        int lastDigit;
        while (tempValue != 0) {
            lastDigit = tempValue % 10;
            reversedValue = reversedValue * 10 + lastDigit;
            tempValue = tempValue / 10;
            System.out.println(lastDigit);
        }
        return reversedValue == x;
    }
}
