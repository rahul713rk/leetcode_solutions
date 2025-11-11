class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int l = 0;
        HashMap<Character,Integer> seen = new HashMap<>();

        for (int r = 0 ; r<s.length() ; r++){
            char c = s.charAt(r);
            seen.put(c , seen.getOrDefault(c , 0)+1);

            while (seen.get(c)>1){
                char temp = s.charAt(l);
                seen.put(temp , seen.get(temp)-1);
                l++;
            }
            res = Math.max(res , (r-l)+1);
        }
        return res;
    }
}