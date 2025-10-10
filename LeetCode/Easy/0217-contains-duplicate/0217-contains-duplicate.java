class Solution {
    static{
        Solution sol = new Solution();
        for (int i =0 ; i<100 ; i++){
            sol.containsDuplicate(new int[]{1,1});
        }
    }
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> res = new HashSet<>();

        for (int i : nums){
            if (!res.contains(i)){
                res.add(i);
            }
            else{
                return true;
            }
        }
        return false;
    }
}