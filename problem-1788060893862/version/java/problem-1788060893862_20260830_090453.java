// Last updated: 8/30/2026, 9:04:53 AM
1class Solution {
2    public int sumDecoded(long[] nums) {
3        long MOD = 1000000007L;
4        long totalSum =0;
5
6        for(long num : nums){
7            int width = (int)(num % 10);
8            long d = num /10;
9
10            String s = String.valueOf(d);
11            String xStr = s.substring(0,width);
12            String yStr = s.substring(width);
13
14            long x = Long.parseLong(xStr);
15            long y = Long.parseLong(yStr);
16
17            long decodedValue = power(x,y,MOD);
18            totalSum = (totalSum + decodedValue)%MOD;
19        }
20        return (int) totalSum;
21    } 
22    private long power(long base,long exp,long mod){
23        long res =1;
24        base = base % mod;
25        while(exp > 0){
26            if((exp & 1) == 1){
27                res = (res * base) % mod;
28            }
29            base =(base * base) % mod;
30            exp >>= 1;
31        }
32        return res;
33    }
34                       
35        }
36        
37    
38