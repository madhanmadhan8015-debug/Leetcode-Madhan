// Last updated: 8/11/2026, 2:15:11 PM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;
        int empty = numBottles;

        while (empty >= numExchange) {
            int newBottles = empty / numExchange;
            total += newBottles;
            empty = newBottles + (empty % numExchange);
        }

        return total;
    }
}
