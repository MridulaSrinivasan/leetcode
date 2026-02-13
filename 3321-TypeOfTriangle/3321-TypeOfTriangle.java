// Last updated: 2/13/2026, 11:32:18 AM
class Solution {
    public String triangleType(int[] nums) {
        String r = new String();
        if((nums[0]+nums[1]<=nums[2])||(nums[0]+nums[2]<=nums[1])||(nums[1]+nums[2]<=nums[0])){
            r = "none";
        }
        else if(nums[0]==nums[1] && nums[0] == nums[2])
        {
           r = "equilateral";
        }
        else if(nums[0]==nums[1]||nums[0]==nums[2]||nums[1]==nums[2])
        {
            r = "isosceles";
        }else 
        {
            r = "scalene";
        }
        return r;
    }
}