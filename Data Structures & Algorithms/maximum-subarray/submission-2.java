class Solution {
    public int maxSubArray(int[] nums) {
        int current = nums[0];
        int max = nums[0];

        for(int i=1; i<nums.length; i++)
        {
            current += nums[i]; 
            max = Math.max(current,max);
            if(current < 0)
            {
                current = 0;
            }
        }

        return max;

    }
}
