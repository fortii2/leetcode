public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode lap = headA;
        ListNode lbp = headB;
        int la = 0, lb = 0;

        while (lap != null) {
            lap = lap.next;
            la++;
        }

        while (lbp != null) {
            lbp = lbp.next;
            lb++;
        }

        int diff = Math.abs(la - lb);

        if (la > lb) {
            lap = headA;
            while (diff-- > 0) {
                lap = lap.next;
            }
            lbp = headB;
        } else {
            lbp = headB;
            while (diff-- > 0) {
                lbp = lbp.next;
            }
            lap = headA;
        }

        while (lap != null) {
            if (lap == lbp) {
                return lap;
            } else {
                lap = lap.next;
                lbp = lbp.next;
            }
        }

        return null;
    }
}
// @lc code=end

