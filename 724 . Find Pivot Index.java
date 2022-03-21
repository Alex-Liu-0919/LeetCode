class Solution {
    public int pivotIndex(int[] nums) {
        
        int leftSum = 0;
        int sum = Arrays.stream(nums).sum();
        
        for(int i=0;i<nums.length;i++){
          if(leftSum == sum-nums[i])
          {
              return i;
          }
          
            leftSum = leftSum + nums[i];
            sum = sum - nums[i];
          
        }
        return -1;
        
    }
}