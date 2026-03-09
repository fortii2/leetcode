class Solution {
    public boolean exist(char[][] board, String word) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (find(board, i, j, word, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean find(char[][] board, int x, int y, String word, int idx) {
        if (word.length() == idx) {
            return true;
        }

        if (x < 0 || y < 0 || x >= board.length || y >= board[0].length) {
            return false;
        }

        if (board[x][y] != word.charAt(idx)) {
            return false;
        }

        char temp = board[x][y];
        board[x][y] = '#';

        boolean isFound = find(board, x - 1, y, word, idx + 1)
                || find(board, x + 1, y, word, idx + 1)
                || find(board, x, y - 1, word, idx + 1)
                || find(board, x, y + 1, word, idx + 1);

        board[x][y] = temp;

        return isFound;
    }
}
