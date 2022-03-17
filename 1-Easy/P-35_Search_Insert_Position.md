## [Search Insert Position](https://leetcode.com/problems/search-insert-position/)

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

*Example-1:* <br/>

*Input:* nums = [1,3,5,6], target = 5  <br/>
*Output:* 2 <br/>

*Example-2:* <br/>

*Input:* nums = [1,3,5,6], target = 2 <br/>
*Output:* 1 <br/>

*Example-3:* <br/>

*Input:* nums = [1,3,5,6], target = 7 <br/>
*Output:* 4 <br/>

### Solution
```
public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target)
                return mid;
            if(nums[mid] < target)
                low = mid + 1;
            else 
                high = mid - 1;
        }
        return high + 1; 
    }
```