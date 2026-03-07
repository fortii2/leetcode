class Solution {
    public int missingNumber(int[] nums) {
        //     Set<Integer> set = new HashSet<>();
        //     int n = nums.length;

        //     for (int num : nums) {
        //         set.add(num);
        //     }

        //     for (int i = 0; i <= n; i++) {
        //         if(!set.contains(i)){
        //             return i;
        //         }
        //     }

        //     return -1;
        //

        int n = nums.length;
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        //  S = 0 + 1 + 2
        //  S = 2 + 1 + 0
        // 2S = 2 + 2 + 2
        // 2S = 3 * 2
        // 2S = (n + 1) * n
        //  S = (n + 1) * n / 2

        int suppose = (n + 1) * n / 2;

        return suppose - sum;
    }
}
