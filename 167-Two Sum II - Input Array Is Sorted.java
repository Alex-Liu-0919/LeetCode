class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        if(numbers==null || numbers.length==0)
        {
                return null;
        }
        
        int i = 0;
        int j = numbers.length - 1;
        while(i<j)
        {
            if(numbers[i]+numbers[j]<target)
            {
                i++;
            }else if(numbers[i]+numbers[j]>target)
            {
                j--;
            }else {
                int[] res = {i+1,j+1};
                return res;
            }
        }
        return null;
    }
}