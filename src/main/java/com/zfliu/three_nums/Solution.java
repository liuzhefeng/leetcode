package com.zfliu.three_nums;

import java.lang.annotation.Target;
import java.util.*;

/**
 * Created by zfliu on 2021/3/1 14:21
 * Desc:
 */

/**
 * desr:
 * 输入：nums = [-1,0,1,2,-1,-4]
 * 输出：[[-1,-1,2],[-1,0,1]]
 */
public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int target = -nums[i];
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int[] twosum = twosum(nums, target);
                if (twosum[0] != -1) {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[i]);
                    list.add(nums[twosum[0]]);
                    list.add(nums[twosum[1]]);
                    result.add(list);
                }
            }
        }
        /**
         * 未去重
         * */
        return result;
    }


    public int[] twosum(int[] nums, int target) {
        Map<Integer, Integer> table = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int minus = target - nums[i];
            if (!table.containsKey(minus)) {
                table.put(nums[i], i);
            } else {
                return new int[]{
                        table.get(minus), i
                };
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        System.out.println(new Solution().threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

}
