class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n= nums.length; 
        int[] arr = new int[n]; 
        int x=0;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                arr[x]=nums[i];
                x++;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]%2!=0){
                arr[x]=nums[i]; 
                x++;
            }
        }
        return arr;
    }
}