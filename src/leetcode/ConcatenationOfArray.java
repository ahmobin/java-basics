package leetcode;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] givenArray = new int[]{1,2,1};
        System.out.println(Arrays.toString(getConcatenation(givenArray)));
    }

    private static int[] getConcatenation(int[] nums) {
        int[] ansArray = new int[2*nums.length];
        for (int i=0; i<2*nums.length; i++){
            if(i>nums.length-1){
                ansArray[i] = nums[i-nums.length];
            }else{
                ansArray[i] = nums[i];
            }
        }
        return ansArray;
    }

    private static int[] getConcatenationWayTwo(int[] nums){
        int n = nums.length;
        int[] ans = new int[2*n];

        for (int i=0 ; i<n ; i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}
