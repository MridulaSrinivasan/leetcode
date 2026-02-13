// Last updated: 2/13/2026, 11:33:33 AM
class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> t = new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer>r = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    r.add(1);
                }else{
                    int val = t.get(i-1).get(j-1)+t.get(i-1).get(j);
                    r.add(val);
                }
            }
            t.add(r);
        }
        return t;
    }
}