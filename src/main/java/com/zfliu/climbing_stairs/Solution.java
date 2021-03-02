package com.zfliu.climbing_stairs;

/**
 * 1阶：1
 * 2阶：2
 * 3阶：1阶+2阶 3
 * 4阶：2阶+3阶
 */
public class Solution {
    /**
     * 递归，复杂度2^n
     */
    public int climbStairs(int n) {
        if (n < 3) {
            return n;
        } else {
            return climbStairs(n - 1) + climbStairs(n - 2);
        }
    }

    /**
     * 1 2 3 5 8 13
     */
    public int climbStairs1(int n) {
        if (n < 3) {
            return n;
        }
        int result = 2, temp1 = 0, temp2 = 1;
        for (int i = 3; i < n + 1; i++) {
            temp1 = temp2;
            temp2 = result;
            result = temp1 + temp2;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().climbStairs1(20));
    }
}
