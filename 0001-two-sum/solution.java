public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int that = target - nums[i];
            if (map.containsKey(that)) {
                res.add(map.get(that));
                res.add(i);
            }
            map.put(nums[i], i);
        }

        return res.stream().mapToInt(i -> i).toArray();
    }
}
