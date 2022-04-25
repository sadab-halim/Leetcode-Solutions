class Solution {
    public void gameOfLife(int[][] board) {
        if (board == null)
            return;

        int m = board.length, n = board[0].length;
        int[][] temp = new int[m][n];
		

        int[] x = new int[] { -1, -1, -1, 0, 0, 1, 1, 1 };
        int[] y = new int[] { -1, 0, 1, -1, 1, -1, 0, 1 };

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int liveCells = 0;
                for (int k = 0; k < x.length; k++) {
                    int new_i = i + x[k];
                    int new_j = j + y[k];
                    if (isSafe(board, new_i, new_j, m, n))
                        liveCells++;
                }
                if (board[i][j] == 1) {
                    if (liveCells < 2)
                        temp[i][j] = 0;
                    else if (liveCells == 2 || liveCells == 3)
                        temp[i][j] = 1;
                    else if (liveCells > 3)
                        temp[i][j] = 0;
                } else {
                    if (liveCells == 3)
                        temp[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = temp[i][j];
            }
        }
    }

    private boolean isSafe(int[][] board, int i, int j, int R, int C) {
        if (i >= 0 && i < R && j >= 0 && j < C && board[i][j] == 1)
            return true;
        return false;
    }
}