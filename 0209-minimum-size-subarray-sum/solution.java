class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int res = Integer.MAX_VALUE;
        int sum = 0;

        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];

            while (sum >= target) {
                res = Math.min(res, j - i + 1);
                sum -= nums[i++];
            }
        }

        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
