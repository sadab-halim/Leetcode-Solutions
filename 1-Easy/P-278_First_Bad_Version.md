## [First Bad Version](https://leetcode.com/problems/first-bad-version/)

You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.

 

*Example-1: <br/>

*Input:* n = 5, bad = 4 <br/>
*Output:* 4 <br/>
*Explanation:* <br/>
call isBadVersion(3) -> false <br/>
call isBadVersion(5) -> true <br/>
call isBadVersion(4) -> true <br/>
Then 4 is the first bad version. <br/>

*Example-2:* <br/>

*Input:* n = 1, bad = 1 <br/>
*Output:* 1 <br/>

### Solution
```
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
```