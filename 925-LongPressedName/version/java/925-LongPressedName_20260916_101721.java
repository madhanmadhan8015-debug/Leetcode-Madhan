// Last updated: 9/16/2026, 10:17:21 AM
1class Solution {
2    public boolean isLongPressedName(String name, String typed) {
3        int ni=0, ti=0; 
4
5        
6        while(ni<name.length() || ti<typed.length()) {
7            
8            if(ni<name.length() && ti<typed.length() && name.charAt(ni)==typed.charAt(ti)) {
9                ni++;
10                ti++;
11            }else if(ti<typed.length() && ti>0 && typed.charAt(ti-1)==typed.charAt(ti)){
12                ti++; 
13            }else {
14                return false; 
15            }
16        }
17        return ni==name.length(); 
18    }
19}