    class Solution {
        public int equalPairs(int[][] grid) {
            HashMap<String, Integer> map = new HashMap<>();
            int n = grid.length;

            for (int[] ints : grid) {
                String row = Arrays.toString(ints);
                map.put(row, map.getOrDefault(row, 0) + 1);
            }

            int count = 0;
            for (int i = 0; i < n; i++) {
                int[] column = new int[n];

                for (int j = 0; j < grid.length; j++) {
                    column[j] = grid[j][i];
                }

                String col = Arrays.toString(column);
                if (map.containsKey(col)) {
                    count += map.get(col);
                }
            }

            return count;
        }
    }
