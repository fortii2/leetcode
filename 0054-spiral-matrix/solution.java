class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0;
        int left = 0;
        int bottom = matrix.length - 1;
        int right = matrix[0].length - 1;

        List<Integer> res = new ArrayList<>();

        while (top <= bottom && left <= right) {

            // left to right
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            top++;

            // top to bottom
            for (int j = top; j <= bottom; j++) {
                res.add(matrix[j][right]);

            }
            right--;

            // right to left
            if (top <= bottom) {
                for (int k = right; k >= left; k--) {
                    res.add(matrix[bottom][k]);
                }
                bottom--;
            }

            // bottom to top
            if (left <= right) {
                for (int l = bottom; l >= top; l--) {
                    res.add(matrix[l][left]);
                }
                left++;
            }
        }

        return res;
    }
}
