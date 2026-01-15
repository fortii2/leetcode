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
    public ListNode deleteMiddle(ListNode head) {

        if (head.next == null) {
            return null;
        }

        ListNode cur = head;

        int size = 0;
        while (cur != null) {
            size++;
            cur = cur.next;
        }

        ListNode previous = head;
        int middle = size / 2;
        while (middle > 1) {
            previous = previous.next;
            middle--;
        }

        previous.next = previous.next.next;
        return head;
    }
}
