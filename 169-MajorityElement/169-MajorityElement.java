// Last updated: 8/11/2026, 2:18:07 PM
class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
            return nums[n/2];
        }
    }
