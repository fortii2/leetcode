class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int p = 0, q = n - 1;

        for (int i = n - 1; i >= 0; i--) {
            int lv = nums[p] * nums[p];
            int rv = nums[q] * nums[q];

            if (lv > rv) {
                res[i] = lv;
                p++;
            } else {
                res[i] = rv;
                q--;
            }
        }

        return res;
    }
}
