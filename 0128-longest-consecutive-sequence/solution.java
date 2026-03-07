class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }

        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        int max = Integer.MIN_VALUE;

        for (int i : set) {
            if (!set.contains(i - 1)) {
                int next = i + 1;
                while (set.contains(next))
                    next++;

                max = Math.max(next - i, max);
            }
        }

        return max;
    }
}
