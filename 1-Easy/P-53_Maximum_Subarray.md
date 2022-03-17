## Maximum Subarray

Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

A subarray is a contiguous part of an array.

 
*Example 1: <br/>
*Input:* nums = [-2,1,-3,4,-1,2,1,-5,4] <br/>
*Output:* 6 <br/>
*Explanation:* [4,-1,2,1] has the largest sum = 6. <br/>

*Example-2:* <br/>
*Input: nums = [1] <br/>
*Output: 1 <br/>

*Example-3:* <br/>
*Input:* nums = [5,4,-1,7,8] <br/>
*Output:* 23 <br/>

### Solution
```
public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE, 
        int currSum = 0;
        
        for(int i = 0; i < nums.length; i++){
            currSum += nums[i];
            
            if(currSum > maxSum) 
                maxSum=currSum;
            if(currSum<0) 
                currSum=0;
        }
        return maxSum;
    }
```