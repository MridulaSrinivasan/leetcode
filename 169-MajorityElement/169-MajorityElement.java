// Last updated: 2/13/2026, 11:33:22 AM
class Solution {
    public int majorityElement(int[] n) {
     int d = n.length/2;
     int count = 1;
     int a = 0;
     int e = n[0];
     Arrays.sort(n);
     for(int i=0;i<n.length-1;i++){
        if(n[i]==n[i+1]){
            count++;
        }else{
            count = 1;
        }
        if(count>a){
            a=count;
            e = n[i];
        }
     }return e;
    }
}