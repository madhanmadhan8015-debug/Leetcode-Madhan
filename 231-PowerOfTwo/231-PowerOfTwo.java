// Last updated: 8/11/2026, 2:17:36 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<1)
        return false;
        while(n%2==0){
            n=n/2;
        }
        if(n==1)
        return true;
        else 
        return false;
        
    }
}
