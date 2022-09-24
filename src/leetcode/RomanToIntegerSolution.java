package leetcode;

import java.util.HashMap;

public class RomanToIntegerSolution {

    public static void main(String[] args) {
        RomanToIntegerSolution romanToIntegerSolution = new RomanToIntegerSolution();
        romanToIntegerSolution.romanToInt("III");
    }

    public int romanToInt(String romanValue) {
        HashMap<String, Integer> romanInteger = new HashMap<>();
        romanInteger.put("I",1);
        romanInteger.put("V",5);
        romanInteger.put("X",10);
        romanInteger.put("L",50);
        romanInteger.put("C",100);
        romanInteger.put("D",500);
        romanInteger.put("M",1000);

        int sum = 0;

        for(int i=0; i<romanValue.length(); i++){
            System.out.print(romanValue.charAt(i)+"\n");
            sum += romanInteger.get("I");
        }

        return sum;
    }
}
