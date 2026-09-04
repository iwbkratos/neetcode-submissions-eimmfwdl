class Solution {
    public int appendCharacters(String s, String t) {
        int l=0;
        int r=0;
        int sl=s.length();
        int tl=t.length();

        while(l<sl && r<tl)
        {
            if(s.charAt(l) == t.charAt(r))
            {
                l++;
                r++;
            }
            else
            {
                l++;
            }
        }

        return tl-r;
    }
}