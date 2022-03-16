## [Contains Duplicates](https://leetcode.com/problems/contains-duplicate/)

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

*Example-1:* <br/>
*Input:* nums = [1,2,3,1] <br/>
*Output:* true <br/>

*Example-2:* <br/>
*Input:* nums = [1,2,3,4] <br/>
*Output:* false <br/>

*Example-3:* <br/>
*Input:* nums = [1,1,1,3,3,4,3,2,4,2] <br/>
*Output:* true <br/>

### Solution
```
public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1]) return true;
        }
        return false;
    }
```