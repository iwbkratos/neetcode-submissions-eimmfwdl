class Solution {

    public String encode(List<String> strs) {
        StringBuilder encode = new StringBuilder();
        for(String str: strs)
        {
            encode.append(str.length()).append('#').append(str);
        }
        return encode.toString();
    }

    public List<String> decode(String str) {

        List<String> decode = new ArrayList<String>();
        int i = 0;

        while(i<str.length())
        {
            //find the delimiter
            int j = i;
            while(str.charAt(j)!='#')
            j++;

            //find the length
            int length = Integer.parseInt(str.substring(i,j));
            
            //move j to the start char of the word
            j++;

            //take the word from the encoded string
            String word = str.substring(j,j+length);

            decode.add(word);
            
            // update i after the current word
            i = j+length;

        }
        return decode;
    }
}
