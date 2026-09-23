class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length()-1;
        int m = word2.length()-1;

        int l = 0, r = 0;
        String s = "";
        while(l<=n && r<=m)
        {
            s += word1.charAt(l) +""+ word2.charAt(r);
            l++;
            r++;
        }

        while(l<=n)
        {
            s +=""+ word1.charAt(l);
            l++;
        }

        while(r<=m)
        {
            s +=""+ word2.charAt(r);
            r++;
        }

        return s;
    }
}