## [Binary Search](https://leetcode.com/problems/binary-search/submissions/)

Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

*Example-1:*

*Input:* nums = [-1,0,3,5,9,12], target = 9 <br/>
*Output:* 4 <br/>
*Explanation:* 9 exists in nums and its index is 4 <br/>

*Example-2:*

*Input:* nums = [-1,0,3,5,9,12], target = 2 <br/>
*Output:* -1 <br/>
*Explanation:* 2 does not exist in nums so return -1 <br/>

### Solution
```
 public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length - 1;
        
        while(low <= high){
            int mid = low + (high - low)/2;
            
            if(nums[mid] == target)
                return mid;
            if(nums[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
```