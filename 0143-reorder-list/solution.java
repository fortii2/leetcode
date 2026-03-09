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
    public void reorderList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();

        ListNode p = head;
        while (p != null) {
            stack.push(p);
            p = p.next;
        }

        p = head;
        while (p != null) {
            ListNode added = stack.pop();

            if (p == added || p.next == added) {
                added.next = null;
                break;
            }

            ListNode next = p.next;
            added.next = next;
            p.next = added;

            p = next;
        }
    }
}
