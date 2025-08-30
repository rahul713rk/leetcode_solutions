class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer , Integer> freq = new HashMap<>();
        int key = 0 , value = 0;
        for (int i : nums){
            freq.put(i , freq.getOrDefault(i,0)+1);
            if (freq.get(i) > value){
                value = freq.get(i);
                key = i;
            }
        }
        return key;
    }
}