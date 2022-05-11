//solution 1 brute force
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        
        for(int i =0; i<nums.length; i++)
        {
             int start = i;
             int sum = 0;
             while(sum< target && start<nums.length)
             {
                 sum = sum + nums[start];
                 ++start;
             }
            if(sum>=target)
            {
                min = Math.min(min, start-i);
            }
        }
        
        return min == Integer.MAX_VALUE ? 0 : min ;
    }
}


//solution 2  two pointers 
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums.length==0)
        {
            return 0;
        }
              
       int left = 0;
       int right = 0 ;
       int sum = 0;
        int min = Integer.MAX_VALUE;
        while(right<nums.length)
        {
           sum= sum + nums[right];
            right++;
            while(sum>=target)
            {
                min = Math.min(min,right-left);
                sum = sum- nums[left];
                left++;
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}