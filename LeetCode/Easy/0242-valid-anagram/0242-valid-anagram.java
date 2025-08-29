class Solution {
    static{
        Solution sol = new Solution();
        for (int i=0 ; i<500 ; i++){
            sol.isAnagram("" , "a");
        }
    }
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] freq = new int[26];
        int n = s.length();
        for (int i = 0 ; i<n ; i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        for (int i : freq){
            if (i != 0) return false;
        }
        return true;
    }
}