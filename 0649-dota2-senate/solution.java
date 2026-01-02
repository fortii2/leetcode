/*
 * @lc app=leetcode id=649 lang=java
 *
 * [649] Dota2 Senate
 */

// @lc code=start

import java.util.LinkedList;

class Solution {
    public String predictPartyVictory(String senate) {
        LinkedList<Integer> radiant = new LinkedList<>();
        LinkedList<Integer> dire = new LinkedList<>();

        Integer i = 0;
        for (char c : senate.toCharArray()) {
            if (c == 'R') {
                radiant.addLast(i++);
            } else {
                dire.addLast(i++);
            }
        }

        while (!radiant.isEmpty() && !dire.isEmpty()) {
            Integer r = radiant.poll();
            Integer d = dire.poll();

            if (r < d) {
                radiant.addLast(i++);
            } else {
                dire.addLast(i++);
            }
        }

        return radiant.isEmpty() ? "Dire" : "Radiant";
    }
}
// @lc code=end

