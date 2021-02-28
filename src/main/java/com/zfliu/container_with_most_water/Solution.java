package com.zfliu.container_with_most_water;

/**
 * 双指针法
 */
public class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0, j = height.length - 1; i < j; ) {
            int _height = Math.min(height[i], height[j]);
            max = Math.max(max, (j - i) * _height);
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        System.out.println(new Solution().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}
