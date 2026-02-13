// Last updated: 2/13/2026, 11:32:15 AM
class Solution {
    public int differenceOfSum(int[] nums) {
     int s = 0;
     int d = 0;
     for(int i=0;i<nums.length;i++){
        s+=nums[i];
        int n=nums[i];
        while(n!=0){
            d+=(n%10);
            n/=10;
        }
     }
     return (s-d);

}
}