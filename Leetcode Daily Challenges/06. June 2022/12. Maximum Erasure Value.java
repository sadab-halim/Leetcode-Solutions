class Solution {
    public static int maximumUniqueSubarray(int[] nums) {
     Set<Integer> set = new HashSet<>();
     int maxSum = 0;		
     int currSum = 0;
     for (int l = 0, r = 0; r < nums.length; r++) {
         currSum += nums[r];
             if (set.contains(nums[r])) {
             while (nums[l] != nums[r]) {
                 currSum -= nums[l];
                 set.remove(nums[l]);
                 l++;
             }
             if (nums[l] == nums[r]) {
                 currSum -= nums[l];
                 set.remove(nums[l]);
                 l++;
             }
         }
         set.add(nums[r]);
         maxSum = Math.max(currSum, maxSum);
     }
     return maxSum;
 }
}