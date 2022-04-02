public boolean searchMatrix(int[][] matrix, int target) {
        int i, j;
        int r= matrix.length;
        int c= matrix[0].length;

        for(i=0; i< r; i++){


            if(target <= matrix[i][c-1])

            for(j= c-1; j>=0; j--){

                if(target==matrix[i][j])
                    return true;                

            } 

        }

        return false;   
    }