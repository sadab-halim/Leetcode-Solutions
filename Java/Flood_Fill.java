public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
    if(image[sr][sc] == newColor){return image;}
    
    helper(image, sr, sc, image[sr][sc], newColor);
    return image;
}

public void helper(int[][] arr, int x, int y, int c_old, int c_new){
    if(x >= arr.length || y >= arr[0].length || x < 0 || y < 0){return;}
    
    if(arr[x][y] == c_old){
        arr[x][y] = c_new;
        helper(arr, x+1, y, c_old, c_new);
        helper(arr, x-1, y, c_old, c_new);
        helper(arr, x, y+1, c_old, c_new);
        helper(arr, x, y-1, c_old, c_new);
    }
    
}