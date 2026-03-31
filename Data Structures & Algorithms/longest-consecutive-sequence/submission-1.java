class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length-1;
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums)
        {
            if(!set.contains(num))
                set.add(num);
        }

        int cons = 0;
        for(int num : nums)
        {
            int subCons = 1;
            int ele = num;
            while(set.contains(ele+1))
            {
                subCons++;
                ele++;
            }
           cons = Math.max(subCons,cons);
        }

        return cons;
    }
}
