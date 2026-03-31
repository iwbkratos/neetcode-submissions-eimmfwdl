class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int n = s.length();
        HashSet<Character> freq = new HashSet(n);
        int l=0;
        int r=0;
        int max = 0;
        while(r<n)
        {
            while(freq.contains(s.charAt(r)))
            {
                freq.remove(s.charAt(l));
                l++;
            }
            freq.add(s.charAt(r));
            max = Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}
