// Last updated: 8/23/2026, 8:43:28 AM
1class Solution {
2    public boolean isPalindromic(String s) {
3       String b=s.chars()
4           .mapToObj(c->String.format("%08d",Integer.parseInt(Integer.toBinaryString(c))))
5.reduce("",String::concat);
6
7        return b.equals(new StringBuilder(b).reverse().toString());
8    }
9}