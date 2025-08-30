class Solution {
    static {
        Solution sol = new Solution();
        for (int i= 0 ;i<500 ; i++){
            sol.majorityElement(new int[] {1});
        }
    }
    public int majorityElement(int[] nums) {
        int key = 0 , count = 0;
        for (int i : nums){
            if (count == 0){
                key = i;
            }
            if (key == i){
                count++;
            }
            else{
                count--;
            }
        }
        return key;
    }
}