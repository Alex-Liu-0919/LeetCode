class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       // int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        dfs(nums, res, new ArrayList<Integer>(), 0);
        return res;
    }
    
    private void dfs (int[] nums, List<List<Integer>> res, List<Integer> current, int index ){
        // here we need to do the copy, it is tricky
        res.add(new ArrayList(current));
        for(int i = index ; i < nums.length; i++ )
        {
           current.add(nums[i]);
           dfs(nums, res,current,i+1);
           current.remove(current.size()-1);
        }
    }
}