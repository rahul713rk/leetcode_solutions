class Solution {
    static{
        Solution sol = new Solution();
        for (int i = 0 ; i < 500 ; i++){
            sol.longestCommonPrefix(new String[] {""});
        }
    }
    public String longestCommonPrefix(String[] strs) {
        String base = strs[0];
        for (int i = 1 ; i<strs.length ; i++){
            int j = 0;
            while (j < Math.min(base.length() , strs[i].length())){
                if (base.charAt(j) != strs[i].charAt(j)){
                    break;
                }
                j++;
            }
            base = base.substring(0,j);
        }
        return base;
    }
}