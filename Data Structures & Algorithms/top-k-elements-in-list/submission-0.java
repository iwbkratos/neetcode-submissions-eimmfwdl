class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap();

        for(int n : nums)
        {
               map.put(n,map.getOrDefault(n,0)+1); 
        }

        List<Integer>[] bucket = new List[nums.length+1];

        for(int key: map.keySet())
        {
             int n = map.get(key);  
             if(bucket[n] == null)
             {
                bucket[n] = new ArrayList<>();
             }
             bucket[n].add(key);          
        }

        List<Integer> list = new ArrayList<>();

        for(int i= bucket.length-1; i>=0 && list.size()<k ; i-- )
        {
             if(bucket[i] != null)
             {
                list.addAll(bucket[i]);
             }
        }

        return list.stream().limit(k).mapToInt(i -> i).toArray();
    }
}
