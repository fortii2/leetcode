/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode sentinel = new ListNode();
        sentinel.next = head;
        
        ListNode fast = sentinel;
        ListNode slow = sentinel;

        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // sentinel 1 null

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return sentinel.next;

    }
}
