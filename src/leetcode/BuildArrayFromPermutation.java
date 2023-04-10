package leetcode;

import java.util.Arrays;

public class BuildArrayFromPermutation {

    public static void main(String[] args) {
        int[] myIntArray = new int[]{5,0,1,2,3,4};
        System.out.println(Arrays.toString(buildArray(myIntArray)));
    }


    private static int[] buildArray(int[] nums) {
        int arrayLength = nums.length;
        int[] returnArray = new int[arrayLength];

        for (int i = 0; i<arrayLength; i++){
            returnArray[i] = nums[nums[i]];
        }
        return returnArray;
    }
}
