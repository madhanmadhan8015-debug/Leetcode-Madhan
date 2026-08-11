// Last updated: 8/11/2026, 2:14:29 PM
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int sum = 0;

        // Take as many 1s as possible
        int takeOnes = Math.min(numOnes, k);
        sum += takeOnes;
        k -= takeOnes;

        // Take 0s (no change to sum)
        int takeZeros = Math.min(numZeros, k);
        k -= takeZeros;

        // Take -1s if still needed
        sum -= k;

        return sum;
    }
}
