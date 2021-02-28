package com.zfliu.movezero;

/**
 * Created by zfliu on 2021/2/23 10:13
 * Desc:
 */
public class Solution {
    /*public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i > j) {
                    nums[j] = nums[i];
                    nums[i] = 0;
                }
                j++;
            }
        }
    }*/

    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        //int[] nums = new int[]{1,0,0,3,2,10};
        int[] nums = new int[]{1, 2, 3, 4,5,6,7,8,9,10};
        new Solution().moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num+"--");
        }
    }
}
