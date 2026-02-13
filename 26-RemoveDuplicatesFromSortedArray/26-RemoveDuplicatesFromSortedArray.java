// Last updated: 2/13/2026, 11:33:52 AM
class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
       for(int i=1;i<nums.length;i++){
        if(nums[i]!=nums[i-1]){
            nums[count] = nums[i];
            count++;
        }
       } 
       return count;
    }
}