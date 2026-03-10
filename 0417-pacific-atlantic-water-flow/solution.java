class Solution {

    int[][] directions = { { -1, 0 }, { 1, 0 }, { 0, 1 }, { 0, -1 } };

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        boolean[][] pacific = new boolean[heights.length][heights[0].length];
        boolean[][] atlantic = new boolean[heights.length][heights[0].length];

        for (int i = 0; i < heights.length; i++) {
            dfs(heights, pacific, i, 0);
            dfs(heights, atlantic, i, heights[0].length - 1);
        }

        for (int j = 0; j < heights[0].length; j++) {
            dfs(heights, pacific, 0, j);
            dfs(heights, atlantic, heights.length - 1, j);
        }

        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < heights.length; i++) {
            for (int j = 0; j < heights[0].length; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    res.add(Arrays.asList(i, j));
                }
            }
        }

        return res;
    }

    public void dfs(int[][] heights, boolean[][] visited, int x, int y) {
        int m = heights.length;
        int n = heights[0].length;

        if (visited[x][y]) {
            return;
        }

        visited[x][y] = true;

        // if neighber bigger, go

        for (int[] dir : directions) {
            int newX = x + dir[0];
            int newY = y + dir[1];

            if (newX < 0 || newY < 0 || newX >= m || newY >= n) {
                continue;
            }

            if (heights[newX][newY] >= heights[x][y]) {
                dfs(heights, visited, newX, newY);
            }
        }
    }
}
