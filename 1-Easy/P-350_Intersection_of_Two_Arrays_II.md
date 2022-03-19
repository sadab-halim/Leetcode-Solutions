## [Intersection of Two Arrays II](https://leetcode.com/problems/intersection-of-two-arrays-ii/)

Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

*Example-1:* <br/>
*Input:* nums1 = [1,2,2,1], nums2 = [2,2] <br/>
*Output:* [2,2] <br/>

*Example-2:* <br/>
*Input:* nums1 = [4,9,5], nums2 = [9,4,9,8,4] <br/>
*Output:* [4,9] <br/>
Explanation: [9,4] is also accepted. <br/>

### Solution
```
public int[] intersect(int[] nums1, int[] nums2) {
       if(nums1.length > nums2.length) {
            int temp[] = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int k = 0;
        for(int num: nums2) {
            Integer count = map.get(num);
            if(count != null && count > 0) {
                nums1[k++] = num;
                map.put(num, count - 1);
            }
        }
        return Arrays.copyOfRange(nums1, 0, k); 
    }
```