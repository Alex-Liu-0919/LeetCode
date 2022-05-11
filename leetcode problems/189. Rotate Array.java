//solution 1
class Solution {
    public void rotate(int[] nums, int k) {
        if(nums==null || nums.length<2 || k==0)
        {
            return;
        }
        
      int [] copy = new int [nums.length];
      for(int i =0; i<nums.length; i++)
      {
          copy[(k+i)%nums.length] = nums[i];
      }
      
     for(int i =0; i<nums.length; i++)
      {
          nums[i] = copy[i];
      }
    }
}

//solution 2
class Solution {
    public void rotate(int[] nums, int k) {
        if(nums==null || nums.length<2 || k==0)
        {
            return;
        }
        int len = nums.length;
        reverse(nums,0,len-1);
        reverse(nums,0,k-1);
        reverse(nums,k,len-1);
            
    }
    
    private void reverse (int[] nums, int start,int end)
    {
        while(start<end)
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}