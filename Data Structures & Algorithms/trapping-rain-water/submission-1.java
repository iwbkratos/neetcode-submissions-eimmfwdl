class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int n = height.length;
        int[] p = new int[n];
        int[] s= new int[n];
        p[0] = height[0];
        for(int i=1; i<n; i++)
        {
            p[i] = Math.max(p[i-1],height[i]);
        }

        s[n-1] = height[n-1];

        for(int i=n-2; i>=0; i--)
        {
            s[i] = Math.max(s[i+1],height[i]);
        }

        int ans=0;
        for(int i=0; i<n; i++)
        {
            int water = Math.min(p[i],s[i]) - height[i];

            if(water>0)
             ans+=water;
        }

        return ans;
    }
}
