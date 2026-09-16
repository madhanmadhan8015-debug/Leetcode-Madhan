// Last updated: 9/16/2026, 9:01:18 AM
1class Solution {
2    class Pair{
3        int row,col,time;
4
5        Pair(int r, int c, int t){
6            row = r;
7            col = c;
8            time = t;
9        }
10    }
11
12    public int orangesRotting(int[][] grid) {
13        int n = grid.length;
14        int m = grid[0].length;
15
16        Queue<Pair> q = new LinkedList<>();
17
18        
19        int freshCnt = 0;
20
21        for(int i=0;i<n;i++){
22            for(int j=0;j<m;j++){
23                if(grid[i][j] == 2){
24                    q.add(new Pair(i,j,0));
25                }
26                if(grid[i][j] == 1){
27                    freshCnt++;
28                }
29            }
30        }
31
32        int dRow[] = {-1,1,0,0};
33        int dCol[] = {0,0,-1,1};
34
35        
36
37        int rc =0,maxTime =0;
38
39        while(!q.isEmpty()){
40            Pair curr = q.poll();
41            int row = curr.row;
42            int col = curr.col;
43            int time = curr.time;
44            
45            maxTime = Math.max(maxTime,time);
46
47            
48            for(int k=0;k<4;k++){
49                int newR = row+dRow[k];
50                int newC = col+dCol[k];
51
52                
53                if(newR >=0 && newR < n && newC >= 0 && newC < m && grid[newR]
54                [newC] == 1){
55                    
56                    grid[newR][newC] = 2;
57                    q.add(new Pair(newR,newC,time+1));
58                    rc++; 
59                }
60            }
61        }
62
63       
64        return rc == freshCnt ? maxTime:-1;
65       
66
67    }
68}