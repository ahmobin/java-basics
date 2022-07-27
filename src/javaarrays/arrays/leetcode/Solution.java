package javaarrays.arrays.leetcode;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args){
        int[] nums = {3,2,4};
        int target = 6;
        Solution solution = new Solution();
        int[] output = solution.twoSum(nums, target);
        System.out.println(Arrays.toString(output));
    }

    public int[] twoSum(int[] nums, int target) {

        for(int i =0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                int sum = nums[i] + nums[j];
                if(sum == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
