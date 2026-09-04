class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b) -> b-a);
        int n = nums.length;
        int[] res = new int[n-k+1];

        for(int i=0; i<k; i++)
        {
            heap.offer(nums[i]);
        }
        res[0] = heap.peek();

        int l=1;
        int r=k;

        while(r<n)
        {
            int out = nums[l-1];
            int in  = nums[r];
            heap.remove(out);
            heap.offer(in);
            res[l] = heap.peek();
            l++;
            r++;
        }

        return res;
    }
}
