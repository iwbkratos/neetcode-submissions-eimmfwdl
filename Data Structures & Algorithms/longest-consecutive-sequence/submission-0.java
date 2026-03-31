class Solution {
    public int longestConsecutive(int[] nums) {
        List<Integer> init = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++)
        {
            set.add(nums[i]);

            if(!set.contains(nums[i]-1))
            init.add(nums[i]);
        }

        int cons = 0;
        for(int i: init)
        {
            int ele = i;
            int subCons = 1;
            while(set.contains(ele+1))
            {
                subCons++;
                ele++;
            }

            cons = Math.max(cons,subCons);

        }

        return cons;
    }
}
