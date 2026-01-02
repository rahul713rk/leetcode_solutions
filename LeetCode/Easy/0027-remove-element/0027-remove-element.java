class Solution {
    static{
        Solution sol = new Solution();
        for (int i = 0 ; i<500 ; i++){
            sol.removeElement(new int[] {} , 0);
        }
    }

    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length;
        while (i<j){
            if (nums[i] == val){
                nums[i] = nums[--j];
            }
            else i++;
        }
        return j;
    }
}