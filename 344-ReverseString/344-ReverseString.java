// Last updated: 8/11/2026, 2:17:03 PM
class Solution {
    public void reverseString(char[] s) {
        int i=0,m=0;
        m=s.length-1;
        while(i<m)
        {
            char temp=s[i];
            s[i]=s[m];
            s[m]=temp;
            i++;
            m--;
        }
       
        
    }
}