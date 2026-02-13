// Last updated: 2/13/2026, 11:32:31 AM
class Solution {
    public int numWaterBottles(int b, int en) {
        int t=0;
        int e = 0;
        int f = b;
        while(f>0){
            t += f;
            e += f;
            f = e/en;
            e = e%en;
        }
        return t;
    }
}