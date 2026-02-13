// Last updated: 2/13/2026, 11:32:55 AM
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                boolean emptyLeft = (i == 0) || (flowerbed[i - 1] == 0);
                boolean emptyRight = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);
                
                if (emptyLeft && emptyRight) {
                    flowerbed[i] = 1; // plant a flower
                    n--; // reduce required flowers
                    if (n == 0) return true; // early exit
                }
            }
        }
        return n <= 0;
    }
}
