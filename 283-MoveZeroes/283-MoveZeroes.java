// Last updated: 8/11/2026, 2:17:22 PM
class Solution {
    public void moveZeroes(int[] nums) {
        int c=0,i,j;
        for(i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[c]=nums[i];
                c++;
            }
        }
        for(j=c;j<nums.length;j++){
        nums[j]=0;
    }
    System.out.print(nums);
}
}