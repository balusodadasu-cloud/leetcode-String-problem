class Solution {
    public int[] twoSum(int[] a, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < a.length; i++) {
            int x = target - a[i];

            if(map.containsKey(x))
                return new int[]{map.get(x), i};

            map.put(a[i], i);
        }

        return new int[]{-1, -1};
    }
}