class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        
        HashMap <Character , Integer> res = new HashMap<>();
        HashMap <Character , Integer> ret = new HashMap<>();
        int n = s.length();
        for (int i = 0 ; i<n ; i++){
            res.put(s.charAt(i) , res.getOrDefault(s.charAt(i),0)+1);
            ret.put(t.charAt(i) , ret.getOrDefault(t.charAt(i),0)+1);
        }
        if (res.size() != ret.size()) return false;
        else {
            for (char c : res.keySet()) {
                if (!res.get(c).equals(ret.get(c))) return false;
            }
        }
        return true;
    }
}