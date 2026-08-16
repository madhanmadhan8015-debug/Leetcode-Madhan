// Last updated: 8/16/2026, 8:46:34 AM
1class Solution {
2    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
3
4        int maxLight = 0;
5        for(int light : lights){
6            maxLight = Math.max(maxLight,light);
7        }
8        int maxPenalty = 0;
9
10        for(int t: arrivalTime){
11            int r = t % period;
12            int currentWait = 0;
13
14            if(r>= maxLight) {
15                currentWait = period - r;
16            }
17            maxPenalty = Math.max(maxPenalty,currentWait);
18        }
19        return maxPenalty;
20        
21    }
22}