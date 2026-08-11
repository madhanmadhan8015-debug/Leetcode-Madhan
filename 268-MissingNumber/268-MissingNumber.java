// Last updated: 8/11/2026, 2:17:29 PM
class Solution {
    public int missingNumber(int[] nums) {
        int n,i,sum=0;
        n=nums.length;
        for(i=0;i<n;i++)
        sum+=nums[i];
        int x=n*(n+1)/2;
        
        return x-sum;
    
    }
}