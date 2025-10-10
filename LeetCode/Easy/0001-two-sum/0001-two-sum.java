class Solution {
    static{
        Solution sol = new Solution();
        for(int i=0 ; i<500 ; i++){
            sol.twoSum(new int[] {1,2},2);
        }
    }
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> dict = new HashMap<>();
        
        for(int i = 0 ; i<nums.length ; i++){
            int residual = target-nums[i];
            if (dict.containsKey(residual)){
                return new int[] {dict.get(residual) , i};
            }
            dict.put(nums[i] , i);
        }
        return new int[0];
    }
}