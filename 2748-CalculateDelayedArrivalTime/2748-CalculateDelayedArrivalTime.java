// Last updated: 8/11/2026, 2:14:26 PM
class Solution {
    public int findDelayedArrivalTime(int aTime, int dTime) {
        return (aTime+dTime)%24;
    }
}