// Last updated: 8/16/2026, 8:47:02 AM
1class Solution {
2    public int nearestDrone(int[][] drones, int[] target) {
3        int minDist = Integer.MAX_VALUE;
4        int ans= -1;
5
6        for(int i=0;i<drones.length;i++){
7            int x = drones[i][0];
8            int y = drones[i][1];
9            int range = drones[i][2];
10            int  dist= Math.abs(x - target[0]) + Math.abs(y - target[1]);
11
12            if(dist <= range && dist < minDist) {
13                minDist = dist;
14                ans = i;
15            }
16        }
17        return ans;
18    }
19}