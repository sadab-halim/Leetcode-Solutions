public int[][] transpose(int[][] matrix) {
    int n = matrix.length, m = matrix[0].length;
    int[][] transpose = new int[m][n];
    
    for(int i = 0; i < m; i++) {
        for(int j = 0; j < n; j++) {
            transpose[i][j] = matrix[j][i];    
        }
    }
    return transpose;
}