class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int i=0;
        int min=Integer.MAX_VALUE;
        int sum=0;

        while(i<nums.length)
        {
            sum+=nums[i];
            while(sum>=target)
            {
                min = Math.min(min,i-l+1);
                sum-=nums[l++];
            }
            i++;
        }
        if(min == Integer.MAX_VALUE)
        {
            return 0;
        }
          
        return min;
    }
}