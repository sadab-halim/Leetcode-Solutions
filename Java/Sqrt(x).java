class Solution {
    public int mySqrt(int x) {
        if(x == 0 || x == 1)
            return x;
        return binarySearch(x, 1, x);
    }
    
    private int binarySearch(int x, int low, int high){
        int mid = low + (high-low)/2;
        if(mid > (x/mid)){
            return binarySearch(x, low, mid);
        } else {s
            if((mid+1) > (x/(mid+1)))
                return mid;
            return binarySearch(x, mid,high);
        }
    }
}