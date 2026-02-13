// Last updated: 2/13/2026, 11:33:10 AM
class Solution {
    public int missingNumber(int[] nums) {
       int k = nums.length;
       int t = k*(k+1)/2;
       int a = 0;
       for(int x : nums){
        a+=x;
       }
       return t-a;
    }
}