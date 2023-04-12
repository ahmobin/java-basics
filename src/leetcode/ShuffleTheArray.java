package leetcode;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int n = 3;
        int[] nums = new int[]{2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }

    private static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < n; i++){
            ans[2*i] = nums[i];  // 0 2 4
            ans[(2*i)+1] = nums[n+i]; // 1 3 5
        }
        return ans;
    }


    private static int[] shuffleWayTwo(int[] nums, int n){
        int[] ans = new int[nums.length];
        int j=n,k=0;
        for(int i=0;i<nums.length;i++) {
            if (i % 2 == 0) {
                ans[i] = nums[k];
                k++;
            } else {
                ans[i] = nums[j];
                j++;
            }
        }
        return ans;
    }
}
