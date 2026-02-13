// Last updated: 2/13/2026, 11:32:48 AM
class Solution {
    public int minSwapsCouples(int[] row) {
        int n = row.length;
        int [] pos = new int[n];
        for(int i=0;i<n;i++){
            pos[row[i]] = i;
        }
        int ans = 0;
        for(int i=0;i<n; i+=2){
            int first=row[i];
            int exp = first^1;
            if(row[i+1]!=exp){
                ans++;
                int partnerpos = pos[exp];
                pos[row[i+1]] = partnerpos;
                pos[exp] = i+1;
                int temp = row[i+1];
                row[i+1] = row[partnerpos];
                row[partnerpos] = temp;
            }
        }return ans;
    }
}