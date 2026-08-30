class Solution {
    public String longestPalindrome(String s) {
        String res = "";
        for(int i=0; i<s.length(); i++)
        {
            //even
          String substr = expand(s,i,i);
            if(substr.length() > res.length())
               res = substr;
            //odd
            substr = expand(s,i,i+1);
            if(substr.length() > res.length())
               res = substr;
        }

        return res;
    }

    public static String expand(String s, int i, int j)
    {
        int n = s.length();
        while(i>=0 && j<n && s.charAt(i) == s.charAt(j))
        {
            j++;
            i--;
        }
// i+1 becoz after the loop i-- always moves one index backward
        return s.substring(i+1,j);
    }
}
