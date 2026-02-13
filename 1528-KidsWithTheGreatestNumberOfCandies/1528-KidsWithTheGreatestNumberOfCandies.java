// Last updated: 2/13/2026, 11:32:34 AM
class Solution {
    public List<Boolean> kidsWithCandies(int[] c, int e) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;

        for (int candies : c)
            if (candies > max)
                max = candies;

        for (int candies : c)
            result.add(candies + e >= max);

        return result; // ✅ matches expected type
    }
}
