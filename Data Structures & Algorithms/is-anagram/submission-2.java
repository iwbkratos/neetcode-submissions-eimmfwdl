class Solution {
    public boolean isAnagram(String s1, String s2) {
         if(s1.length() != s2.length())
            return false;
        if (s1.isEmpty() && s2.isEmpty())
            return true;

        int [] n = new int[256];
        int [] m = new int[256];

        for (int i=0; i<s1.length(); i++)
        {
            int n_ascii = s1.charAt(i);
            int m_ascii = s2.charAt(i);

            n[n_ascii] +=1;
            m[m_ascii] +=1;
        }
        System.out.println(Arrays.toString(n));
        System.out.println(Arrays.toString(m));

        for(int i=0; i<256; i++)
        {
            if(n[i]!=m[i])
                return false;
        }

        return true;
    }
}
