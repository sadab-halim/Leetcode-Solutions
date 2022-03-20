## [Reverse String](https://leetcode.com/problems/reverse-string/submissions/)

Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

 

*Example-1:* <br/>
*Input:* s = ["h","e","l","l","o"] <br/>
*Output:* ["o","l","l","e","h"] <br/>

*Example-2:* <br/>
*Input:* s = ["H","a","n","n","a","h"] <br/>
*Output:* ["h","a","n","n","a","H"] <br/>

### Solution
```
public void reverseString(char[] s) {
        int low = 0;
        int high = s.length - 1;
        
        while(low < high){
            char temp = s[low];
            s[low] = s[high];
            s[high] = temp;
            low++;
            high--;
        }
    }
```