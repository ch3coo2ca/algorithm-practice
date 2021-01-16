package com.leetcode;


class ListNode {

    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class MergeTwoSortedLists {
    public static ListNode mergedNode = new ListNode();

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null || l2 == null) {
            return null;
        }

        ListNode minNode = l1.val <= l2.val ? l1 : l2;
        minNode.next = l1.val <= l2.val ? l2 : l1;
//        ListNode newNode = new ListNode();
//        newNode.val = l1.val <= l2.val ? l2.val : l1.val;
//        newNode.next = mergeTwoLists(l1.next, l2.next);

        return mergedNode.next = minNode;

    }

    public static void main(String[] args) {
        ListNode n3 = new ListNode(3, null);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);

        ListNode m3 = new ListNode(4, null);
        ListNode m2 = new ListNode(3, m3);
        ListNode m1 = new ListNode(1, m2);

        mergeTwoLists(n1, m1);
    }
}
