// Last updated: 8/23/2026, 9:10:50 AM
1class Solution {
2    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
3        List<List<Integer>> r=new ArrayList<>();
4        Arrays.sort(nums);
5        long c=lower;
6        for(int n:nums){
7            if(n<c)
8                continue;
9            if(n>upper)
10                break;
11            if(n>c)
12                r.add(Arrays.asList((int)c,n-1));
13            c=(long)n+1;
14        }
15        if(c<=upper)
16            r.add(Arrays.asList((int)c,upper));
17        return r;
18    }
19}