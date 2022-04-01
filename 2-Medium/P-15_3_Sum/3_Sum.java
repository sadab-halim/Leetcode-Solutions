public public List<List<Integer>> threeSum(int[] nums) {
    int n=nums.length;
    List<List<Integer>> res= new ArrayList();
    if(n < 3)
        return res;
    Arrays.sort(nums); 
    
    for(int i = 0; i < n - 2; i++){
         if(nums[i] > 0) 
             break;

        if((i == 0) || (i > 0 && nums[i] > nums[i-1])){
            int l = i + 1;
            int h = n - 1;
            while(l < h){
                if(nums[l] + nums[h] + nums[i] == 0){
                    res.add(Arrays.asList(nums[i],nums[l],nums[h]));
                    
                    while(l<h && nums[l]==nums[l+1])
                        l++;
                while(l<h && nums[h]==nums[h-1])
                    h--;
                l++;
                h--;
                }
                else if(nums[l]+nums[h]+nums[i]<0)
                    l++;
                else
                    h--;      
            }
        }
    }
    return res;
}class 3_Sum {
    
}
