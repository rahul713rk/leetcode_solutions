class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> res = new HashSet<>();

        for (int num : nums){
            if (!res.add(num)){
                return true ;
            }
            // System.out.println(res.add(num));
            // // this line print true if res add the num else return false
        }
        return false;
    }
}