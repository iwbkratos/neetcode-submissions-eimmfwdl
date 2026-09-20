class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res = new ArrayList<>();
        backtrack(0,new ArrayList<>(),target,nums);
        return res;
    }

    private void backtrack(int i, List<Integer> temp, int target, int[] nums)
    {
        if(target == 0)
        {
            res.add(new ArrayList<>(temp));
            return;
        }
        if(target<0 || i > nums.length-1)
        {
            return;
        }
        temp.add(nums[i]);
        backtrack(i,temp,target-nums[i],nums);
        temp.remove(temp.size()-1);
        backtrack(i+1,temp,target,nums);
    }
}
