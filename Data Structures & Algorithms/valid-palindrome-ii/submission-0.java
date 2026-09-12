class Solution {
    public boolean validPalindrome(String s) {
        
        int l = 0;
        int r = s.length()-1;
        int count = 0;
        while(l<r)
        {
            if(s.charAt(l) != s.charAt(r))
            {
                count++;
            }
            l++;
            r--;
        }

        return count <= 1;
    }
}