// Last updated: 2/13/2026, 11:33:02 AM
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer>l=new ArrayList<>();
        boolean[] used = new boolean[nums2.length];
        for(int n1 : nums1){
            for(int j=0;j<nums2.length;j++){
                if(!used[j]&&n1==nums2[j]){
                    {
                        l.add(n1);
                        used[j]=true;
                        break;
                    }
                }
            }
        }
        int[] r = new int[l.size()];
        for(int i=0;i<l.size();i++){
            r[i]=l.get(i);
        }
        return r;
    }
}