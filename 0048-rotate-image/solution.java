class Solution {
    public void rotate(int[][] matrix) {
        // int n = matrix.length;

        // int idx = 0;
        // int[] temp = new int[n * n];

        // for (int j = 0; j < n; j++) {
        //     for (int i = n - 1; i >= 0; i--) {
        //         temp[idx++] = matrix[i][j];
        //     }
        // }

        // idx = 0;
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         matrix[i][j] = temp[idx++];
        //     }
        // }

        int n = matrix.length;

        // up triangle transpose
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // reverse each row
        for (int i = 0; i < n; i++) {
            int[] row = matrix[i];

            // [,]
            int left = 0;
            int right = n - 1;

            while (left < right) { // [1, 1] no need to operate
                int temp = row[left];
                row[left] = row[right];
                row[right] = temp;

                left++;
                right--;
            }

        }
    }
}
