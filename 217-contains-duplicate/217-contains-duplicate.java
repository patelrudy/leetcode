class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> values = new HashSet<>();
        
        for (int num : nums) {
            if (values.contains(num)){
                return true;
            }
            values.add(num);
        }
        return false;
    }
}