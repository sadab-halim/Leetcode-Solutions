class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans=new int[n][n];
        
        int minr=0;
        int minc=0;
        int maxr=n-1;
        int maxc=n-1;
        int c=1;
        int tot=n*n;
        
        while(c<=tot){
            
            for(int i=minc;i<=maxc;i++){
                ans[minr][i]=c;
                c++;
            }
            minr++;
            
            for(int i=minr;i<=maxr;i++){
                ans[i][maxc]=c;
                c++;
            }
            maxc--;
            
            for(int i=maxc;i>=minc && c<=tot ;i-- ){
                ans[maxr][i]=c;
                c++;
            }
            maxr--;
            
            for(int i=maxr;i>=minr && c<=tot;i--){
                ans[i][minc]=c;
                c++;
            }
            minc++;
        }
        
        return ans;   
    }
}