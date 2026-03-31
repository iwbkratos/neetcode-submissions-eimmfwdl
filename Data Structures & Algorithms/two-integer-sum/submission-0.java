class Solution {
    public int[] twoSum(int[] arr, int target) {
         HashMap<Integer,Integer> store = new HashMap();

        for (int i = 0; i < arr.length; i++) {
            int onepiece = target - arr[i];

            if(store.containsKey(onepiece) && store.get(onepiece) != i)
            {
                return new int[]{store.get(onepiece),i};
            }

            store.put(arr[i],i);
        }
        return new int[]{};
    }
}
