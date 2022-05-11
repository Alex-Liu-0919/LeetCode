class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> missingNumbers = new ArrayList<Integer>();
        HashSet<Integer> appearNumbers = new HashSet<Integer>();
        
        for(int i: nums)
        {
          appearNumbers.add(i); 
        }
        
        for(int i=1;i<= nums.length;i++)
        {
            if(!appearNumbers.contains(i))
            {
                missingNumbers.add(i);
            }
        }
        
        return missingNumbers;
    }
}