package com.zfliu.tree.datastructs;

import java.util.LinkedList;

public class BiNode {
    int    val;
    BiNode LeftNode;
    BiNode RightNode;

    public BiNode(int val) {
        this.val = val;
    }

    public void setNode(int val, BiNode LeftNode, BiNode RightNode) {
        this.val = val;
        this.LeftNode = LeftNode;
        this.RightNode = RightNode;
    }

    public static BiNode createBiTree(Integer[] nums) {
        if (nums.length == 0) {
            return null;
        }
        BiNode             head         = new BiNode(nums[0]);
        LinkedList<BiNode> subTreeQueue = new LinkedList<BiNode>();
        subTreeQueue.push(head);
        for (int i = 1; i < nums.length; i++) {
            if (!subTreeQueue.isEmpty()) {
                BiNode cur = subTreeQueue.pop();
                if (nums[i] != null) {
                    cur.LeftNode = new BiNode(nums[i]);
                    subTreeQueue.add(cur.LeftNode);
                }
                i++;
                if (i > nums.length) {
                    break;
                }
                if (nums[i] != null) {
                    cur.RightNode = new BiNode(nums[i]);
                    subTreeQueue.add(cur.RightNode);
                }
            } else {
                break;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[]{1, 2, 3, null, null, 4, null, null, 5, null, null};
        createBiTree(a);
        System.out.println("jhjk");
    }
}
