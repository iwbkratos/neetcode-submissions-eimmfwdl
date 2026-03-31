class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> map = new HashMap<>();

        for(String str: strs)
        {
            int[] freq = new int[26];
            for(char c: str.toCharArray())
            {
                freq[c-'a']++;
            }

            StringBuilder key = new StringBuilder();

            for(int k: freq)
            {
                key.append('#').append(k);
            }

            map.computeIfAbsent(key.toString(),k -> new ArrayList()).add(str);            
        }
        return new ArrayList<>(map.values());
    }
}
