class Solution {
    public boolean isPalindrome(String s) {
      s=s.toLowerCase();
      String str = "";
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9'))
            {
                str += c;
            }

            
        }
       int k=0;
       int j=str.length()-1;

       while(k<j)
       {
          if(str.charAt(k)!= str.charAt(j))
          {
                return false;
          }

          k++;
          j--;
       }

       return true;
    }
}
