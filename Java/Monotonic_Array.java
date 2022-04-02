public boolean isMonotonoic(int[] nums){
    if(nums.length <= 1)
        return true;
    boolean monoInc = true;
    boolean monoDec = true;

    for(int i = 1; i < nums.length; i++){
        if(nums[i] <= nums[i-1])
            continue;
        else {
            monoInc = false;
            break;
        }
    }

    for(int i = 1; i < nums.length; i++){
        if(nums[i] >= nums[i-1])
            continue;
        else {
            monoDec = false;
            break;
        }
    }
    return monoInc || monoDec;
}