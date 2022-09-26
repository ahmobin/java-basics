package leetcode;

import java.util.HashMap;

public class RomanToIntegerSolution {

    public static void main(String[] args) {
        RomanToIntegerSolution romanToIntegerSolution = new RomanToIntegerSolution();
        System.out.println(romanToIntegerSolution.romanToInt("MCMXCIV"));
    }

    public int romanToInt(String s) {
        HashMap<Character, Integer> romanInteger = new HashMap<>();
        romanInteger.put('I',1);
        romanInteger.put('V',5);
        romanInteger.put('X',10);
        romanInteger.put('L',50);
        romanInteger.put('C',100);
        romanInteger.put('D',500);
        romanInteger.put('M',1000);

        int total = 0;
        for (int i = 0; i<s.length(); i++){
            int romanIntValue = romanInteger.get(s.charAt(i));

            if(i>0){
                total += romanIntValue;
                if(romanInteger.get(s.charAt(i)) > romanInteger.get(s.charAt(i-1))){
                    total -= romanIntValue + romanInteger.get(s.charAt(i-1));
                    romanIntValue = romanInteger.get(s.charAt(i)) - romanInteger.get(s.charAt(i-1));
                    total += romanIntValue;
                }
            }else{
                total = romanIntValue;
            }
        }


        return total;
    }
}
