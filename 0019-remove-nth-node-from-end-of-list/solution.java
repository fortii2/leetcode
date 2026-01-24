class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode sentinel = new ListNode();
        sentinel.next = head;

        ListNode fast = sentinel;
        ListNode slow = sentinel;

        int moveFast = n + 1;
        while (moveFast-- > 0) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return sentinel.next;
    }
}
