// Last updated: 8/11/2026, 2:16:17 PM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();

        for (char c : jewels.toCharArray())
            set.add(c);

        int count = 0;
        for (char c : stones.toCharArray()) {
            if (set.contains(c))
                count++;
        }

        return count;
    }
}