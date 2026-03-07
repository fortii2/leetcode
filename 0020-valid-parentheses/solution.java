/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        if (s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {

                if (stack.isEmpty()) {
                    return false;
                }

                char temp = stack.pop();

                if (c == ')' && temp != '(') {
                    return false;
                }
                if (c == ']' && temp != '[') {
                    return false;
                }
                if (c == '}' && temp != '{') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
// @lc code=end

