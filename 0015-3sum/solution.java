/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

import java.util.*;

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        if (nums[0] > 0) {
            return result;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int cur = nums[i] + nums[left] + nums[right];
                if (cur < 0) {
                    left++;
                } else if (cur > 0) {
                    right--;
                } else {
                    result.add(List.of(nums[i], nums[left], nums[right]));

                    while (left < right && nums[left] == nums[left + 1])
                        left++;

                    while (left < right && nums[right] == nums[right - 1])
                        right--;

                    left++;
                    right--;
                }
            }

        }

        return result;
    }
}
// @lc code=end

