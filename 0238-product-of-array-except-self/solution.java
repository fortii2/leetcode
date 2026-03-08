class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] res = new int[n];

        int[] prefix = new int[n];
        prefix[0] = 1;

        int suffix = 1;

        // 2,2,3,4
        // 1 2 4 12 prefix
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        // 2, 2, 3, 4
        //              1 suffix
        for (int i = n - 1; i >= 0; i--) {
            res[i] = prefix[i] * suffix;
            suffix *= nums[i];
        }

        return res;
    }
}
