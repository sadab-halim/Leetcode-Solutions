## [Squares of a Sorted Array](https://leetcode.com/problems/squares-of-a-sorted-array/submissions/)

Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

 

*Example-1:* <br/>
*Input:* nums = [-4,-1,0,3,10] <br/>
*Output:* [0,1,9,16,100] <br/>
*Explanation:* After squaring, the array becomes [16,1,0,9,100]. <br/>
After sorting, it becomes [0,1,9,16,100]. <br/>

*Example-2:* <br/>
*Input:* nums = [-7,-3,2,3,11] <br/>
*Output:* [4,9,9,49,121] <br/>

### Solution
```
public int[] sortedSquares(int[] nums) {
        for(int i=0; i<nums.length; i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
```