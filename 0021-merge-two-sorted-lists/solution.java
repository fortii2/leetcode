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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode sentinel = new ListNode();

        ListNode cur = sentinel;
        ListNode a = list1;
        ListNode b = list2;

        while (a != null && b != null) {
            if (a.val < b.val) {
                cur.next = a;
                cur = cur.next;
                a = a.next;
            } else {
                cur.next = b;
                cur = cur.next;
                b = b.next;
            }
        }

        while (a != null) {
            cur.next = a;
            cur = cur.next;
            a = a.next;
        }

        while (b != null) {
            cur.next = b;
            cur = cur.next;
            b = b.next;
        }

        return sentinel.next;
    }
}
