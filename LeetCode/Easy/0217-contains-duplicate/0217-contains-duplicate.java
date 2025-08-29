class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> res = new HashSet<>();

        for (int num : nums){
            res.add(num);
        }
        return res.size() != nums.length;
    }
}