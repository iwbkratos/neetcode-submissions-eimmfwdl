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
        //int ans = 0;
        int n = s.length();
        while(i>=0 && j<n && s.charAt(i) == s.charAt(j))
        {
            //ans = j-i+1;
            j++;
            i--;
        }

        return s.substring(i+1,j);
    }
}
