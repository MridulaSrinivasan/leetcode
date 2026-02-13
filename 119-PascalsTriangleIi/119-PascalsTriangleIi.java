// Last updated: 2/13/2026, 11:33:32 AM
class Solution {
    public List<Integer> getRow(int r) {
        List<List<Integer>> t = new ArrayList<>();
        for(int i=0;i<=r;i++){
            List<Integer> re = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    re.add(1);
                }else{
                    int val = t.get(i-1).get(j-1)+t.get(i-1).get(j);
                    re.add(val);
                }
            }
            t.add(re);
        }
        return t.get(r);
    }
}