package com.zfliu.numarradd;

import java.util.List;

/**
 * Created by zfliu on 2021/2/23 17:13
 * Desc:
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode up = l1;
        ListNode down = l2;
        int jinwei = 0;
        ListNode resultNode = null;
        int time = 0;
        ListNode point = null;
        while (up != null || down != null) {
            if (up == null) {
                up = new ListNode(0);

            }
            if (down == null) {
                down = new ListNode(0);
            }
            int ge = (up.getVal() + down.getVal() + jinwei) % 10;
            jinwei = (up.getVal() + down.getVal() + jinwei) / 10;
            if (time == 0) {
                resultNode = new ListNode();
                resultNode.setVal(ge);
                point = resultNode;
            } else {
                ListNode listNode = new ListNode();
                listNode.setVal(ge);
                point.setNext(listNode);
                point = point.getNext();
            }
            time++;
            up = up.next;
            down = down.next;
        }
        if (jinwei > 0) {
            ListNode listNode = new ListNode(jinwei);
            point.setNext(listNode);
        }
        return resultNode;
    }

    public static void main(String[] args) {
        ListNode node1 = creat(new int[]{3, 9, 9, 9, 9, 9, 9});
        ListNode node2 = creat(new int[]{1, 2, 9, 9, 9, 9, 9});
        ListNode result = new Solution().addTwoNumbers(node1, node2);
        while (result != null) {
            System.out.println(result.getVal());
            result = result.getNext();
        }
    }

    public static ListNode creat(int[] nums) {
        ListNode node1 = new ListNode(nums[0]);
        ListNode point = node1;
        for (int i = 1; i < nums.length; i++) {
            ListNode next = new ListNode(nums[i]);
            point.setNext(next);
            point = next;
        }
        return node1;
    }

}
