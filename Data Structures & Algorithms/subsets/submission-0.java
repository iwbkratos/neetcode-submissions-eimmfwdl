class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        for(int i=0; i<Math.pow(2,n); i++)
        {
            List<Integer> set = new ArrayList<Integer>();
            for(int j=0; j<n; j++)
            {
                if((1<<j & i) > 0)
                 {
                    set.add(nums[j]);
                 }
            }
            result.add(set);
        }

        return result;
    }
}
