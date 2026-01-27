
/*
 * @lc app=leetcode id=350 lang=java
 *
 * [350] Intersection of Two Arrays II
 */
import java.util.*;

// @lc code=start
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int[] result = new int[nums1.length];
        int index = 0;

        for (int i : nums2) {
            int count = map.getOrDefault(i, 0);
            if (count-- > 0) {
                result[index++] = i;
                map.put(i, count);
            }
        }

        return Arrays.copyOfRange(result, 0, index);
    }
}
// @lc code=end

