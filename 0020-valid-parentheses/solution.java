/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.size() <= 0) {
                    return false;
                }

                char temp = stack.pop();

                if (c == ')' && temp != '('
                        || c == '}' && temp != '{'
                        || c == ']' && temp != '[') {
                    return false;
                }
            }
        }

        return stack.size() == 0 ? true : false;
    }
}
// @lc code=end

