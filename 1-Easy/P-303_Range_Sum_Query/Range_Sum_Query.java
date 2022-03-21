class NumArray {

    private int[] preNums;

    public NumArray(int[] nums) {
      this.preNums = new int[nums.length + 1];
      for (int i = 1; i < preNums.length; i++) {
          preNums[i] = nums[i - 1] + preNums[i - 1];
      }
    }

    public int sumRange(int left, int right) {
        return preNums[right + 1] - preNums[left];
    }
}