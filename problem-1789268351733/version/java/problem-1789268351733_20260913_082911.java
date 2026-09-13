// Last updated: 9/13/2026, 8:29:11 AM
1class Solution {
2    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
3        int[][] tempGrid = new int[n][n];
4
5        for(int i=0;i<n;i++){
6            int shift = rowShift[i] % n;
7            for(int j=0;j<n;j++){
8                tempGrid[i][j] = grid[i][(j + shift) % n];
9            }
10        }
11        int [][] resultGrid = new int[n][n];
12
13        for(int j=0;j<n;j++){
14            int shift = colShift[j] % n;
15            for(int i=0;i<n;i++){
16                resultGrid[i][j] = tempGrid[(i + shift) % n][j];
17            }
18        }
19        return resultGrid;
20    }
21}