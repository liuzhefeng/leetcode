package com.zfliu.three_nums;

/**
 * Created by zfliu on 2021/3/1 15:05
 * Desc:
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/***
 *
 * 首先我们先对原数组进行排序，这样可以把重复的值集中到一起，便于去重。
 *
 * 确定第一个元素时，如果它已经比 0 大了，那么可以直接跳出循环，因为后面的数字都比它大。如 [1, 2, 3, 4], i = 0, nums[i] > 0, 这样是不可能产生合法的情况的，直接 break。
 *
 * 确定第一个元素时，如果发现它与它前面的值一样，那么跳过本轮。如 [-1, -1, 0, 1], 在第一轮后，已经选出了 {-1, 0, 1}, 现在 i = 1，nums[i] == nums[i - 1], 为了避免重复，直接 continue。
 *
 * 接下来利用双指针，left 指向 i + 1, right 指向 nums.length - 1。逐个进行判断，并注意去重。
 *
 * */


public class Solution2 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        if (nums.length < 3) return null;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) break;
            /**
             * 避免重复
             * */
            int left = i+1, right = nums.length - 1;
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                while (left < right) {
                    if (nums[left] + nums[right] == -nums[i]) {
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;
                        left++;
                        right--;
                    } else if (nums[left] + nums[right] < -nums[i]) left++;
                    else right--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution2().threeSum(new int[]{1,2,-2,-1}));
    }
}
