// Last updated: 8/11/2026, 2:19:21 PM
class Solution {
    public boolean isPalindrome(int x) {
        int d,temp,rev=0;
        temp=x;
        if(x<0)
        return false;
        else{
        while(x!=0){
            d=x%10;
            rev=rev*10+d;
            x=x/10;
        }
        if(rev==temp)
        return true;
        else
        return false;
        }
        
    }
}