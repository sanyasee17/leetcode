package leetcode.LeetCode86;

// https://leetcode.com/problems/partition-list/description/

public class PartitionList {

    public ListNode partition(ListNode head, int x) {

        ListNode leftHeadNode = new ListNode(); // Left Node Head
        ListNode leftTailNode = leftHeadNode; // Left Node Tail

        ListNode rightHeadNode = new ListNode(); // Right Node Head
        ListNode rightTailNode = rightHeadNode; // Right Node Tail

        ListNode currentNode = head;

        while(currentNode != null) {
            if(currentNode.val < x) {
                // Add to Left Tail
                leftTailNode.next = new ListNode(currentNode.val);
                leftTailNode = leftTailNode.next;
            } else {
                // Add to Right Tail
                rightTailNode.next = new ListNode(currentNode.val);
                rightTailNode = rightTailNode.next;
            }

            currentNode = currentNode.next;
        }

        // Add Right Head to Left Tail
        leftTailNode.next = rightHeadNode.next;

        // Return Left Head as it now contains both right and left
        return leftHeadNode.next;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}
