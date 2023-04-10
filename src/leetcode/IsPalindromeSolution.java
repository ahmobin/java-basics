package leetcode;

import java.lang.*;
import java.util.Objects;

public class IsPalindromeSolution {

    public static void main(String[] args){
        System.out.println(isPalindrome(1221));
        String original = "1221";
        String reverse = reverse(original);
        if(verifyPalindrome(original, reverse)){
            System.out.println(original + " is palindrome");
        }else{
            System.out.println(original + " is not palindrome");
        }
    }

    private static String reverse(String myString){
        char[] letters = new char[myString.length()];

        int index=0;
        for(int i=myString.length()-1 ; i>=0 ; i--){
            letters[index] = myString.charAt(i);
            index++;
        }

        StringBuilder reverse = new StringBuilder();

        for(int i=0; i<myString.length(); i++){
            reverse.append(letters[i]);
        }

        return reverse.toString();
    }

    private static boolean verifyPalindrome(String original, String reverse){
        return Objects.equals(original, reverse);
    }

    public static boolean isPalindrome(int x){
        // first we need to store the value in temporary variable..
        int tempValue = x;
        // now to should handle the negative value by Math.abs()
        tempValue = Math.abs(tempValue);
        // initialise last digit value and reversed value for the number
        int reversedValue = 0;
        int lastDigit;

        // then we check and reverse our number until it 0
        while ( tempValue != 0){
            lastDigit = tempValue % 10;
            reversedValue = reversedValue * 10 + lastDigit;
            tempValue = tempValue / 10;
        }

        return reversedValue == x;
    }


}
