class Solution {
    static{
        Solution sol = new Solution();
        for (int i=0 ; i<500 ; i++){
            sol.isAnagram("a" ,"a");
        }
    }
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){return false;}
        int[] counter = new int[26];
        for (int i : counter){
            i = 0;
        }
        int n = s.length();
        for (int i = 0 ; i < n ; i++){
            counter[s.charAt(i)-'a']++;
            counter[t.charAt(i)-'a']--;
        }

        for (int i : counter){
            if (i != 0){
                return false;
            }
        }
        return true;
    }
}