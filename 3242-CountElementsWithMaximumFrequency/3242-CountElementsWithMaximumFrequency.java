// Last updated: 2/13/2026, 11:32:16 AM
class Solution {
    public int maxFrequencyElements(int[] n) {
       int count = 1;
       int t=1;
       int max = 1;
       Arrays.sort(n);
       for(int i=0;i<n.length-1;i++){
        if(n[i]==n[i+1]){
            count++;
        }
        else{
            count = 1;
        }
        if(count>max){
            max = count;
            t = count;
        }else if(count == max){
            t+=count;
        }
       }
       return t;
    }
}