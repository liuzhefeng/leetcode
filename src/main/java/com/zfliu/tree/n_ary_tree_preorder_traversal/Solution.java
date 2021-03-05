package com.zfliu.tree.n_ary_tree_preorder_traversal;

import com.zfliu.tree.Node;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

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
        List<Integer> results = new LinkedList();
        if (root == null) {
            return results;
        } else {
            results.add(root.val);
            List<Node> children = root.children;
            for (Node child : children) {
                preorder(child);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        List<Node> queue = new LinkedList<Node>();
        List<Node> tree  = new LinkedList<Node>();
        Integer[]  arrs  = {1, null, 3, 2, 4, null, 5, 6};
        Node       head = new Node(arrs[1]);
        for (int i = 0; i < arrs.length; i++) {
            Node node = new Node(arrs[i]);
            queue.add(node);
            if (arrs[i] == null) {

            }

        }
    }
}
