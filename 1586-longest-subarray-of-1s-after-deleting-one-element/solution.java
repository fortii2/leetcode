
    class Solution {
        public int longestSubarray(int[] nums) {
            int left = 0;
            int longest = 0;
            int zeroCount = 0;

            for (int right = 0; right < nums.length; right++) {
                if (nums[right] == 0) {
                    zeroCount++;
                }

                while (zeroCount > 1) {
                    if (nums[left] == 0) {
                        zeroCount--;
                    }
                    left++;
                }

                longest = Math.max(longest, right - left);
            }
            return longest;
        }
    }
