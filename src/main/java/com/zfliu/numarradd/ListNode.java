package com.zfliu.numarradd;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by zfliu on 2021/2/23 17:13
 * Desc:
 */
@Setter
@Getter
@NoArgsConstructor
public class ListNode {
    ListNode next;
    int val;

    public ListNode(ListNode next, int val) {
        this.next = next;
        this.val = val;
    }

    public ListNode(int val) {
        this.val = val;
    }
}
