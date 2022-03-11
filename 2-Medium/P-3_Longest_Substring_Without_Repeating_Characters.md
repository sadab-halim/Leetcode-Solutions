# [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-palindromic-substring/)

Given a string s, return the longest palindromic substring in s.

*Example-1* <br/>
*Input:* s = "babad" <br/>
*Output:* "bab" <br/>
*Explanation:* "aba" is also a valid answer. <br/>

*Example-2* <br/>
*Input:* s = "cbbd" <br/>
*Output:* "bb"

### Solution
```
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
```