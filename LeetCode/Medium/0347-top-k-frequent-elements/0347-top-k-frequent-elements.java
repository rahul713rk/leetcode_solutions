class Solution {
    static{
        Solution sol = new Solution();
        for(int i =0 ; i<100 ; i++){
            sol.topKFrequent(new int[] {1} , 1);
        }
    }
    // sorting method
    // time complexity - O(nlogn)
    // space complexity - O(n)
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer , Integer> count = new HashMap<>();
        
        for (int num : nums){
            count.put(num , count.getOrDefault(num,0)+1);
        }
        // System.out.println(count);

        List<int[]> temp = new ArrayList<>();

        for (Map.Entry<Integer , Integer> entry : count.entrySet()){
            temp.add(new int[] {entry.getValue() , entry.getKey()});
        }
        // System.out.println(Arrays.deepToString(temp.toArray()));
        temp.sort((a,b) -> b[0]-a[0]);
        // System.out.println(Arrays.deepToString(temp.toArray()));

        int[] res = new int[k];

        for(int i =0; i<k ; i++){
            res[i] = temp.get(i)[1];
        }
        return res;
        
    }
}