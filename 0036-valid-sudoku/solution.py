class Solution:
    def isValidSudoku(self, board: list[list[str]]) -> bool:
        rows = [set() for _ in range(9)]
        cols = [set() for _ in range(9)]
        squares = [[set() for _ in range(3)] for _ in range(3)]

        for i in range(9):
            for j in range(9):
                val = board[i][j]

                if val == ".":
                    continue

                if val in rows[i]:
                    return False

                if val in cols[j]:
                    return False

                r, c = i // 3, j // 3
                if val in squares[r][c]:
                    return False

                rows[i].add(val)
                cols[j].add(val)
                squares[r][c].add(val)

        return True

