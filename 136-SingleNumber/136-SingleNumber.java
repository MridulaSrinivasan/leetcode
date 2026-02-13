// Last updated: 2/13/2026, 11:33:28 AM
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;  // XOR operation
        }
        return result;
    }
}
 