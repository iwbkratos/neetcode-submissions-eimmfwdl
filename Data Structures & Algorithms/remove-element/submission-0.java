class Solution {
    public int removeElement(int[] nums, int val) {
        
        int index = -1;
        int l = 0;
        int r = nums.length-1;

        while(l<r)
        {
            while(nums[l]!=val)
            {
                l++;
            }

            while(nums[r]==val)
            {
                r--;
            }

            int temp = nums[r];
            nums[r]  = nums[l];
            nums[l] = temp;
            l++;
            r--;
        }

        return l+1;
    }
}