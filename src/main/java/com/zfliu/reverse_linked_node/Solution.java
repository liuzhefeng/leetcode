package com.zfliu.reverse_linked_node;

/**
 * 数组反转
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode tempNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tempNode;
        }
        return prev;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        ListNode node1 = new ListNode(9,head);
        ListNode node2 = new ListNode(8,node1);
        System.out.println(new Solution().reverseList(node2));
    }
}



class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}