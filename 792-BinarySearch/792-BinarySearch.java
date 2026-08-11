// Last updated: 8/11/2026, 2:16:14 PM
class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;//6
        int low=0,high=n-1;//6-1=5
        while(low<=high)//3<=5
        {
            int mid=(low+high)/2;//3+5=8/2=4
            if(nums[mid]==target)//nums[4]==9 9==9
            return mid;
            else if(nums[mid]<target)//nums[2]<9 3<9
            low=mid+1;//2+1=3
            else
            high=mid-1;

        }
        return -1;
        
    }
}