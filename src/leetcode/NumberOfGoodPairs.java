package leetcode;

import java.lang.reflect.Array;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] inputArray = new int[]{1,1,1,1};
        System.out.println(numIdenticalPairs(inputArray));;
    }


    private static int numIdenticalPairs(int[] inputArray){
        int sum = 0;
        for (int i=0; i<inputArray.length; i++){
            for (int j=0; j<inputArray.length; j++){
                if(inputArray[i] == inputArray[j]){
                    if(i < j){
                        sum += 1;
                    }
                }
            }
        }

        return sum;

    }
}
