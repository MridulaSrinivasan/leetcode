// Last updated: 2/13/2026, 11:33:17 AM
class Solution {
    public boolean containsNearbyDuplicate(int[] n, int k) {
        for(int i=0;i<n.length;i++){
            for(int j=i+1;j<=i+k && j<n.length;j++){
                if(n[i]==n[j]){
                    return true;
                }
            }
        }
        return false;
    }
}