class Solution {
    public int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                nums[i] = 0;
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            int absVal = Math.abs(nums[i]);
            if (absVal > 0 && absVal < nums.length + 1) {
                if (nums[absVal - 1] > 0) {
                    nums[absVal - 1] = -1 * nums[absVal - 1];
                } else if (nums[absVal - 1] == 0) {
                    nums[absVal - 1] = -1 * (nums.length + 1);
                }
            }
        }
        
        for (int i = 1; i < nums.length + 1; i++) {
            if (nums[i - 1] >= 0) return i;
        }
        return nums.length + 1;
    }
}