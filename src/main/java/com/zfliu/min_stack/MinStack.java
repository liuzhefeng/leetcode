package com.zfliu.min_stack;

/**
 * Created by zfliu on 2021/3/3 15:57
 * Desc:
 */

/**
 * Input
 * ["MinStack","push","push","push","getMin","pop","top","getMin"]
 * [[],[-2],[0],[-3],[],[],[],[]]
 * <p>
 * Output
 * [null,null,null,null,-3,null,0,-2]
 */
public class MinStack {

    private Node head;

    /**
     * initialize your data structure here.
     */
    public MinStack() {

    }

    public void push(int x) {
        if(head == null)
            head = new Node(x, x);
        else
            head = new Node(x, Math.min(x, head.min), head);
    }

    public void pop() {

    }

    public int top() {
        return 0;
    }

    public int getMin() {
        return 0;
    }

    private class Node {
        int  val;
        int  min;
        Node next;

        private Node(int val, int min) {
            this(val, min, null);
        }

        private Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }

}
