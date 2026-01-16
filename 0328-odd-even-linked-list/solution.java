class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next; // odd = even.next, so even != null

            even.next = odd.next;
            even = even.next; // even = odd.next = even.next.next, so even.next != null
        }

        odd.next = evenHead;
        return head;
    }
}
