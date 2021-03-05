package com.zfliu.tree.n_ary_tree_preorder_traversal;

import com.zfliu.tree.Node;

import java.util.*;

/**
 * Created by zfliu on 2021/3/5 16:50
 * Desc:
 * 给定一个 N 叉树，返回其节点值的 前序遍历 。
 * N 叉树 在输入中按层序遍历进行序列化表示，每组子节点由空值 null 分隔（请参见示例）。
 */

/**
 * 输入：root = [1,null,3,2,4,null,5,6]
 * 输出：[1,3,5,6,2,4]
 */
public class Solution {
    public List<Integer> preorder(Node root) {
        /*先序遍历*/
        /**
         * 先序遍历：根左右
         * 利用栈模拟递归调用
         * 将根结点压入栈中，当栈不空时执行：
         * 弹出栈中结点，将其放入结果队列中
         * 将该结点的孩子按照倒序依次放入栈中
         */
        Stack<Node>         stack = new Stack<Node>();
        LinkedList<Integer> pre   = new LinkedList<Integer>();
        if (root == null) {
            return pre;
        }
        stack.add(root);
        while (!stack.isEmpty()) {
            Node pop = stack.pop();
            pre.add(pop.val);
            Collections.reverse(pop.children);
            for (Node child : pop.children) {
                stack.add(child);
            }
        }
        return pre;
    }

    public static void main(String[] args) {
        Node          tree     = new Solution().createTree();
        List<Integer> preorder = new Solution().preorder(tree);
        System.out.println(preorder);
    }

    Node createTree() {
        Integer[] arrs = {1, null, 3, 2, 4, null, 5, 6};
        Node node = new Node(1, Arrays.asList(new Node(3, Arrays.asList(new Node(5),
                new Node(6))), new Node(2), new Node(4)));
        return node;
    }
}
