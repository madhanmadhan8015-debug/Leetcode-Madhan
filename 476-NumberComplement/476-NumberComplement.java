// Last updated: 8/11/2026, 2:16:41 PM
class Solution {
    public int findComplement(int num) {
        int temp=num;
        int mask=0;
        while(temp>0){
            mask=(mask<<1);
            mask^=1;
            temp>>=1;
        }
            return num^mask;
        
    }
}