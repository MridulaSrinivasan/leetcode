// Last updated: 2/13/2026, 11:32:38 AM
class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        //int p=0;
        for(int i=nums.length-1;i>=2;i--){
            if(nums[i-1]+nums[i-2]>nums[i]){
                return nums[i-1]+nums[i-2]+nums[i];
            }
        }return 0;
    }
}