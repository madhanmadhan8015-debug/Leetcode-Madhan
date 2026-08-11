// Last updated: 8/11/2026, 2:13:54 PM
class Solution {
    public int minimumCost(int[] nums, int k) {
        long r=k;
        long t=0;
        long mod=1_000_000_007;

        for(int i=0;i<nums.length;i++){

            while(r<nums[i]){
             long d=nums[i]-r;
             long on=(d+k-1)/k;
                t+=on;
                r+=on*k;
            }
            r-=nums[i];
        }
        long a=t;
        long b=t+1;
        if(a%2==0){
            a/=2;
        }
        else{
            b/=2;
        }
        long tc=((a%mod)*(b%mod))%mod;
        return (int) tc;
        

    }
}