class Solution {
        public boolean uniqueOccurrences(int[] arr) {
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int j : arr) {
                map.put(j, map.getOrDefault(j, 0) + 1);
            }

            HashSet<Integer> integers = new HashSet<>(map.values());

            return integers.size() == map.size();
        }
}
