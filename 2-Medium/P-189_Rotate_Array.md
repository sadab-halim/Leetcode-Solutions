## [Rotate Array](https://leetcode.com/problems/rotate-array/)

Given an array, rotate the array to the right by k steps, where k is non-negative.

*Example-1:* <br/>
*Input:* nums = [1,2,3,4,5,6,7], k = 3 <br/>
*Output:* [5,6,7,1,2,3,4] <br/>
*Explanation:* <br/>
rotate 1 steps to the right: [7,1,2,3,4,5,6] <br/>
rotate 2 steps to the right: [6,7,1,2,3,4,5] <br/>
rotate 3 steps to the right: [5,6,7,1,2,3,4] <br/>

*Example-2:* <br/>
*Input:* nums = [-1,-100,3,99], k = 2 <br/>
*Output:* [3,99,-1,-100] <br/>
*Explanation:* <br/>
rotate 1 steps to the right: [99,-1,-100,3] <br/>
rotate 2 steps to the right: [3,99,-1,-100] <br/>

### Solution
```
public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        
        reverse(nums, 0, n-k-1);
        reverse(nums, n-k, n-1);
        reverse(nums, 0, n-1);
    }
    
    public static void reverse(int[] nums, int low, int high){
        while(low < high){
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;
            high--;
        }
    }
```