package com.zfliu.norepeatcharactor;

/**
 * Created by zfliu on 2021/2/24 15:04
 * Desc:
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] from = s.toCharArray();
        char[] to = new char[from.length];
        int k = 1;
        to[0] = from[0];
        for (int i = 0; i < from.length; i++) {
            for (int j = 1; j < from.length; j++) {
                if (from[i] != from[j]) {
                    to[k] = from[j];
                    k++;
                }
            }
        }
        return to.length;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLongestSubstring("pwwkew"));
    }
}
