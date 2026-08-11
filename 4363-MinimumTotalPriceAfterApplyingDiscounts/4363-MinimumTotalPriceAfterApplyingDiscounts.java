// Last updated: 8/11/2026, 2:13:41 PM
class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);

        double sum = 0;
        int n = Math.min(prices.length,discounts.length);

        for(int i=0;i<n;i++){
            int p = prices[prices.length - 1 - i];
            int d = discounts[discounts.length - 1 - i];

            sum += p * (100 - d) / 100.0;
        }
        for(int i=0 ;i<prices.length - n; i++)
            {
                sum += prices[i];
            }
        return sum;
    }
}