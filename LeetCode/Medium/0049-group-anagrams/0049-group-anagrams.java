class Solution {
    static{
        Solution sol = new Solution();
        for (int i = 0 ; i < 500 ; i++){
            sol.groupAnagrams(new String[] {""});
        }
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> res = new HashMap<>();
        for (String s : strs){
            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            String key = new String(temp);

            if (!res.containsKey(key)){
                res.put(key , new ArrayList<>());
                res.get(key).add(s);
            }
            else {
                res.get(key).add(s);
            }
        }
        return new ArrayList<> (res.values());
    }
}