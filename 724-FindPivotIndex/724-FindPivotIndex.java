// Last updated: 8/11/2026, 2:16:25 PM
class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0, left = 0;
        for (int num : nums) total += num;

        for (int i = 0; i < nums.length; i++) {
            if (left == total - left - nums[i])
                return i;
            left += nums[i];
        }
        return -1;
    }
}