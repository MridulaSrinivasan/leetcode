// Last updated: 2/13/2026, 11:33:05 AM
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0)
        {
            return false;
        }
        while(n%4 == 0){
            n= n/4;
        }return n==1;
    }
}