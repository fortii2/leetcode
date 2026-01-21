class Solution {

    // 0 1 right, 0 -1 left, 1 0 down, -1 0 up
    public int[][] generateMatrix(int n) {
        int top = 0;
        int left = 0;
        int bottom = n - 1;
        int right = n - 1;
        int count = 1;

        int[][] res = new int[n][n];

        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) {
                res[top][j] = count++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                res[i][right] = count++;
            }
            right--;

            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    res[bottom][j] = count++;
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    res[i][left] = count++;
                }
                left++;
            }
        }

        return res;
    }
}
