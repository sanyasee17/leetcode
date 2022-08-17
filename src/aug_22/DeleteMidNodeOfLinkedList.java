package aug_22;

// https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/

import java.util.List;

public class DeleteMidNodeOfLinkedList {

    public ListNode deleteMiddle(ListNode head) {

        if(head == null || head.next == null){
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;
        ListNode midPrev = null;

        while (fast != null && fast.next != null){
            midPrev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if(midPrev.next != null) {
            midPrev.next = midPrev.next.next;
        }

        return head;

    }

    private class ListNode {
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

}
