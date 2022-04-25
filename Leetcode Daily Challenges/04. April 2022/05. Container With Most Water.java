class Solution {
    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length - 1;
        
        int max = Math.min(height[low], height[high]) * (high - low);
        while(low < high) {
            if(height[low] <= height[high])
                low++;
            else
                high--;
            max = Math.max(max, Math.min(height[low], height[high]) * (high - low));
        }
        return max;
    }
}