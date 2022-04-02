public int firstBadVersion(int n) {
        int low = 1, high = n;
        while(low + 1 < high){
            int mid = low + ((high - low)/2);
            if(isBadVersion(mid))
                high = mid;
            else 
                low = mid;
        }
        return isBadVersion(low) ? low : high;
    }