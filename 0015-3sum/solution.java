class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i - 1] == nums[i])
                continue;

            int first = nums[i];

            int p = i + 1;
            int q = nums.length - 1;

            while (p < q) {
                if (nums[p] + nums[q] + first == 0) {
                    res.add(List.of(nums[p], nums[q], first));
                    p++;
                    q--;

                    while (p < q && nums[p - 1] == nums[p])
                        p++;
                    while (p < q && nums[q + 1] == nums[q])
                        q--;
                } else if (nums[p] + nums[q] + first < 0) {
                    p++;
                } else {
                    q--;
                }
            }
        }

        return res;
    }
}
