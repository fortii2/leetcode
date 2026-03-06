class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((pair1, pair2) -> pair2[1] - pair1[1]);

        for (Map.Entry<Integer,Integer> entrySet : map.entrySet()) {
            int[] temp = new int[]{entrySet.getKey(), entrySet.getValue()};
            pq.offer(temp);
        }

        int[] res = new int[k];
        int idx = 0;

        while (idx < k) {
            res[idx++] = pq.poll()[0];
        }

        return res;
    }
}
