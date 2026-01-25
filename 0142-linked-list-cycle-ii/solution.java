class Solution {
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode, Integer> map = new HashMap<>();
        ListNode p = head;

        while (p != null) {
            map.put(p, map.getOrDefault(p, 0) + 1);
            
            if (map.get(p) > 1) {
                return p;
            }

            p = p.next;
        }

        return null;
    }
}
