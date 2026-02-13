// Last updated: 2/13/2026, 11:32:12 AM
class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum1 = 0;
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 9) {
                sum1 = sum1 + nums[i];
            } else {
                c = c + nums[i];
            }
        }
        if (c > sum1 || c < sum1)
            return true;
        else
            return false;

    }
}