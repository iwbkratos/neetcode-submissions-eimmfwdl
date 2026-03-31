class Solution {
    public boolean hasDuplicate(int[] arr) {
        if(arr.length == 0)
        {
            return false;
        }

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if(map.containsValue(arr[i])){
               return  true;
            }

            map.put(i,arr[i]);
        }
        return false;
    }
}