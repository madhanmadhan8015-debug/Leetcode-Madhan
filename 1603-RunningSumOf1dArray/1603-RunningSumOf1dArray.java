// Last updated: 8/11/2026, 2:15:13 PM
class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        for(int i=1;i<n;i++)
          nums[i]=nums[i]+nums[i-1];
        return nums;
        
    }
}