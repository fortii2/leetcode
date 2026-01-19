/*
 * @lc app=leetcode id=844 lang=java
 *
 * [844] Backspace String Compare
 */

// @lc code=start
class Solution {
    public boolean backspaceCompare(String s, String t) {
        System.out.println(handle(s));
        System.out.println(handle(t));
        return handle(s).equals(handle(t));
    }

    public String handle(String s) {
        char[] arr = s.toCharArray();
        int fast = 0, slow = 0;

        while (fast < arr.length) {
            if (arr[fast] == '#') {
                if (slow > 0) {
                    slow--;
                }

                fast++;
                continue;
            }

            arr[slow++] = arr[fast++];
        }

        return String.valueOf(arr).substring(0, slow);
    }
}
// @lc code=end

