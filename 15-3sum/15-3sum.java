class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length && nums[i] <= 0; i++) {
            if (i == 0 || nums[i - 1] != nums[i]) {
                threeSumHelper(nums, i, res, 0);
            }
        }
        return res;
    }
    
    public void threeSumHelper(int[] nums, int i, List<List<Integer>> res, int target) {
        int high = nums.length - 1;
        int low = i + 1;
        
        while (low < high) {
            int curr = nums[i] + nums[low] + nums[high];
            if (curr < target) {
                low++;
            } else if (curr > target) {
                high--;
            } else {
                res.add(Arrays.asList(nums[i], nums[low++], nums[high--]));
                while (low < high && nums[low] == nums[low - 1]) low++;
            }
        }
    }
}