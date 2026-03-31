class Solution {
    public boolean isAnagram(String s1, String s2) {
         if(s1.length() != s2.length())
            return false;
        if (s1.isEmpty() && s2.isEmpty())
            return true;

        int [] arr = new int[256];

        for (int i=0; i<s1.length(); i++)
        {
            int n_ascii = s1.charAt(i);
            int m_ascii = s2.charAt(i);

            arr[n_ascii] ++;
            arr[m_ascii] --;
        }
        System.out.println(Arrays.toString(arr));

        for(int i=0; i<256; i++)
        {
            if(arr[i] != 0)
                return false;
        }

        return true;
    }
}
