int res = 0;
    int count = 0;
    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(!visited[i][j] && grid[i][j] == 1){
                    count = 0;
                    helper(grid, visited, i, j);
                }
            }
        }
        return res;
    }
    
    public void helper(int[][] grid, boolean[][] visited, int i, int j){
        if(i<0 || i >=grid.length || j < 0 || j >= grid[0].length){
            return;
        }
        else if(visited[i][j] || grid[i][j]==0){
            return;
        }
        else{
            visited[i][j] = true;
            count++;
            res = Math.max(count, res);
            helper(grid, visited, i+1, j);
            helper(grid, visited, i-1, j);
            helper(grid, visited, i, j+1);
            helper(grid, visited, i, j-1);
        }
    }