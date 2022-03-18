## [Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/)

You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

*Example-1:*

*Input:* nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3 <br/>
*Output:* [1,2,2,3,5,6] <br/>
*Explanation:* The arrays we are merging are [1,2,3] and [2,5,6]. <br/>
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1. <br/>

Example 2: <br/>

*Input:* nums1 = [1], m = 1, nums2 = [], n = 0 <br/>
*Output:* [1] <br/>
*Explanation:* The arrays we are merging are [1] and []. <br/>
The result of the merge is [1]. <br/>

Example 3: <br/>

*Input:* nums1 = [0], m = 0, nums2 = [1], n = 1 <br/>
*Output:* [1] <br/>
*Explanation:* The arrays we are merging are [] and [1]. <br/>
The result of the merge is [1]. <br/>
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1. <br/>

### Solution
```
public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for(int i=m; i<nums1.length; i++){
            nums1[i] = nums2[j];
            j++;
        }
        Arrays.sort(nums1);
    }
```