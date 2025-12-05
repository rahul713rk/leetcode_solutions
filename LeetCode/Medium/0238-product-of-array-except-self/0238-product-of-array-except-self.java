class Solution {
    static{
        Solution sol = new Solution();
        for (int i = 0 ; i<200; i++){
            sol.productExceptSelf(new int[] {1,1});
        }
    }
    public int[] productExceptSelf(int[] nums) {
        int pre = 1;
        int post = 1;
        int n  = nums.length;
        int[] res = new int[n];
        for (int i = 0 ; i<n ; i++){
            res[i] = 1;
        }

        for (int j = 0 ; j<n ; j++){
            res[j] *= pre;
            pre *= nums[j];
        }
        // System.out.println(Arrays.toString(res));

        for(int k = n-1 ; k>=0 ; k--){
            res[k] *= post;
            post *= nums[k];
        }
        // System.out.println(Arrays.toString(res));

        return res;
    }
}