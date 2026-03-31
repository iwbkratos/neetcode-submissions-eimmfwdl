class Solution {
    public boolean isAnagram(String s1, String s2) {
      if(s1.length() != s2.length())
            return false;
        if (s1.isEmpty() && s2.isEmpty())
            return true;

        HashMap<Character,Integer> freq = new HashMap<>();
        for(int i=0; i<s1.length(); i++)
        {
            if(freq.containsKey(s1.charAt(i)))
            {
                freq.put(s1.charAt(i),freq.get(s1.charAt(i))+1);
            }
            else
            {
                freq.put(s1.charAt(i),1);
            }

        }

        for(int i=0; i<s2.length();i++)
        {
            if(!freq.containsKey(s2.charAt(i)) || freq.get(s2.charAt(i)) <=0){
                return false;
            }
            freq.put(s2.charAt(i),freq.get(s2.charAt(i))-1);
        }
        return true;
    }
}
