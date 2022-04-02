public boolean isValidSudoku(char[][] board) {
        int[][] row = new int[9][9];
        int[][] col = new int[9][9];
        int[][][] subBox = new int[3][3][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char ch = board[i][j];
                if (ch != '.') {
                    int num = ch - '0' - 1;
                    row[i][num]++;
                    col[j][num]++;
                    subBox[i / 3][j / 3][num]++;
                    if (row[i][num] > 1 || col[j][num] > 1 || subBox[i / 3][j / 3][num] > 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }