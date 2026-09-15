class PrefixTree {

    public Node head;
    public PrefixTree() {
        head = new Node();
    }

    public void insert(String word) {
        Node t = head; 
        int l = word.length();

        for(int i=0; i<l; i++)
        {
            char c = word.charAt(i);
            if(t.hm.containsKey(c))
            {
                t = t.hm.get(c);
            }
            else
            {
                Node nn = new Node();
                t.hm.put(c,nn);
                t = nn;
            }
        }
        t.isEnd = true;
    }

    public boolean search(String word) {
        Node t = head; 
        int l = word.length();

        for(int i=0; i<l; i++)
        {
            char c = word.charAt(i);
            if(t.hm.containsKey(c))
            {
                t = t.hm.get(c);
            }
            else
            {
                return false;
            }
        }

        return t.isEnd;

    }

    public boolean startsWith(String prefix) {
        Node t = head; 
        int l = prefix.length();

        for(int i=0; i<l; i++)
        {
            char c = prefix.charAt(i);
            if(t.hm.containsKey(c))
            {
                t = t.hm.get(c);
            }
            else
            {
                return false;
            }
        }

        return true;        
    }
}

class Node
{
    public boolean isEnd;
    public HashMap<Character,Node> hm;

    public Node()
    {
        isEnd = false;
        hm = new HashMap<>();
    }
}
