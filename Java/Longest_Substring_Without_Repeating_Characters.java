public int lengthOfLongestSubstring(String s) {
        int[] character = new int[256];
        int left = 0;
        int right = 0;
        int res = 0;
        
        while(right < s.length()){
            char r = s.charAt(right);
            character[r]++;
            
            while(character[r] > 1){
                char l = s.charAt(left);
                character[l]--;
                left++;
            }
            res = Math.max(res, right - left + 1);
            right++;
        }
        return res;
    }