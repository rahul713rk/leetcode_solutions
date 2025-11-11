class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int l = 0;
        HashMap<Character,Integer> seen = new HashMap<>();

        for (int r = 0 ; r<s.length() ; r++){
            char c = s.charAt(r);
            if (seen.containsKey(c) && seen.get(c) >= l){
                l = seen.get(c)+1;
            }
            res = Math.max(res , (r-l)+1);
            seen.put(c, r);
        }
        return res;
    }
}