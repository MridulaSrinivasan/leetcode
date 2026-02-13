// Last updated: 2/13/2026, 11:33:51 AM
class Solution {
    public int removeElement(int[] n, int v) {
        int count=0;
        for(int i=0;i<n.length;i++){
            if(n[i]!=v){
                n[count]=n[i];
                count++;
            }
        }return count;
    }
}