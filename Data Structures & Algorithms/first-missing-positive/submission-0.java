class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        int n=nums.length;
        while(i<n)
        {
            if(nums[i]>=1 && nums[i]<=n)
            {
               int  correct_i = nums[i]-1;

               if(nums[correct_i]!=correct_i+1)
               {
                 int temp = nums[correct_i];
                 nums[correct_i] = nums[i];
                 nums[i] = temp;
               }
               else
                i++;
            }
            else
                i++;
        }

        for(int j=0; j<n; j++)
        {
            if(nums[j]!=j+1)
             return j+1;
        }

        return n+1;
    }
}