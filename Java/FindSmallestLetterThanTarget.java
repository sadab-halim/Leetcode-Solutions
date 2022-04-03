class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low = 0;
        int high = letters.length;
        int n = letters.length;
        
        char ans = letters[0];
        if((int)target >= (int)letters[n-1])
            return ans;
        while(low <= high)
        {
            int mid=(low + high)/2;
            if((int)letters[mid] > (int)target)
            {
                ans = letters[mid];
                high = mid - 1;
            }
            else if((int)letters[mid] <= (int)target)
                low = mid+1;
           
        }
        return ans;
    }
}