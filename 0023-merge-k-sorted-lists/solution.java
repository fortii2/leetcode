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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

        for (ListNode node : lists) {
            if (node != null) {
                pq.offer(node);
            }
        }

        ListNode sentinel = new ListNode();
        ListNode p = sentinel;

        while (!pq.isEmpty()) {

            ListNode cur = pq.poll();

            if(cur.next != null){
                pq.offer(cur.next);
            }

            p.next = cur;
            p = p.next;
        }

        return sentinel.next;
    }
}
