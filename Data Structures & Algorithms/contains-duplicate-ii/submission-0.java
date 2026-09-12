class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int l = 0;
        int r = nums.length-1;

        while(l<r)
        {
            if(nums[l] == nums[r])
            {
                return Math.abs(r-l) <= k;
            }
        }

        return false;
    }
}