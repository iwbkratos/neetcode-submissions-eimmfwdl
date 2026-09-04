class Solution {
    public int removeElement(int[] nums, int val) {        
        int l = 0;
        int r = nums.length;

        while(l<r)
        {
            if(nums[l]==val)
            {
                r--;
                nums[l] = nums[r];
            } 
            else
            {
                l++;
            }          
        }

        return r;
    }
}