package com.zfliu.valid_parentheses;

/**
 * Created by zfliu on 2021/3/2 9:32
 * Desc:
 */

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Input: s = "()"
 * Output: true
 */
public class Solution {
    public boolean isValid(String s) {
        Deque  deque = new LinkedList<String>();
        char[] chars = s.toCharArray();
        if (chars.length % 2 == 1) {
            return false;
        }
        Map<Character, Character> characterHashMap = new HashMap<Character, Character>();
        characterHashMap.put('}', '{');
        characterHashMap.put(')', '(');
        characterHashMap.put(']', '[');
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(' || chars[i] == '[' || chars[i] == '{') {
                deque.addLast(chars[i]);
                continue;
            }
            if (deque.peekLast() != characterHashMap.get(chars[i])) {
                return false;
            }
            deque.removeLast();
        }
        return deque.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isValid("()"));
    }
}
