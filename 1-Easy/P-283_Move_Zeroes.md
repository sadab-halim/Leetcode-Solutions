## [Move Zeroes](https://leetcode.com/problems/move-zeroes/)

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 
*Example-1* <br/>
*Input:* nums = [0,1,0,3,12] <br/>
*Output:* [1,3,12,0,0]

*Example-2* <br/>
*Input:* nums = [0] <br/>
*Output:* [0]

### Solution, T.C: O(n)

### Java Code
```
public void moveZeroes(int[] nums){
   int count = 0;
   int n = nums.length;
   for(int i = 0; i < n; i++)
	if(nums[i] != 0)
	     nums[count++] = nums[i];

   while(count < n)
        nums[count++] = 0;
}
```
