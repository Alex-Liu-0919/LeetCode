class Solution {
    public int dominantIndex(int[] nums) {
        
        if(nums==null || nums.length ==1)
        {
            return 0;
        }
        
        int max = Arrays.stream(nums).max().getAsInt();
        int indexOfMax=-2;
        
        for(int i = 0; i< nums.length;i++)
        {
            
            if(nums[i]==max)
            {
                indexOfMax = i;
                
            }else if(max>=2*nums[i])
            {
                continue;
                
            }else {
                return -1;
                
            }

        }
        
        return indexOfMax;
        
        
        
    }
}