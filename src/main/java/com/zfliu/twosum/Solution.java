package com.zfliu.twosum;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zfliu on 2021/2/23 16:46
 * Desc:
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
       /* for (int i = 0;i<nums.length;i++){
            for (int k = 0; k < nums.length; k++) {
                if (k == i) {
                    continue;
                }
                int sum = nums[i] + nums[k];
                if (sum == target) {
                    return new int[]{i, k};
                }
                if (sum > target) {
                    break;
                }
            }
        }
        return new int[]{-1, -1};*/
        /**
         * 空间换时间
         * 使用哈希表，可以将寻找 target - x 的时间复杂度降低到从 O(N)O(N) 降低到 O(1)O(1)
         * */
        Map<Integer, Integer> table = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int minus = target - nums[i];
            if (!table.containsKey(minus)) {
                table.put(nums[i], i);
            }else{
                return new int[]{
                        table.get(minus),i
                };
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = new int[]{
                0, 2, 15, 7
        };
        int target = 9;
        int[] result = new Solution().twoSum(nums, target);
        System.out.println(result[0] + "---" + result[1]);
    }
}
