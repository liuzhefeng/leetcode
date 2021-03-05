package com.zfliu.tree;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zfliu on 2021/3/5 16:51
 * Desc:
 */

/**
 * 确定递归函数的参数和返回值：
 * 确定哪些参数是递归的过程中需要处理的，那么就在递归函数里加上这个参数， 并且还要明确每次递归的返回值是什么进而确定递归函数的返回类型。
 * <p>
 * 确定终止条件：
 * 写完了递归算法, 运行的时候，经常会遇到栈溢出的错误，就是没写终止条件或者终止条件写的不对，操作系统也是用一个栈的结构来保存每一层递归的信息，如果递归没有终止，操作系统的内存栈必然就会溢出。
 * <p>
 * 确定单层递归的逻辑：
 * 确定每一层递归需要处理的信息。在这里也就会重复调用自己来实现递归的过程。
 * <p>
 */
@Data
public class Node {
    public int        val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
        children = new ArrayList<Node>();
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }

    public boolean isLeaf() {
        if (children.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean addChildNode(Node node) {
        children.add(node);
        return true;
    }
}
