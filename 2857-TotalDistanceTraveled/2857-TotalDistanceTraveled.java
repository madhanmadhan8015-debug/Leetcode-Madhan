// Last updated: 8/11/2026, 2:14:16 PM
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int distance = 0;

        while (mainTank >= 5 && additionalTank > 0) {
            mainTank -= 5;
            distance += 50;
            mainTank += 1;
            additionalTank -= 1;
        }

        distance += mainTank * 10;
        return distance;
    }
}
