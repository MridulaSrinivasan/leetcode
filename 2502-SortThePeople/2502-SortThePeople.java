// Last updated: 2/13/2026, 11:32:19 AM
class Solution {
    public String[] sortPeople(String[] names, int[] height) {
        for(int i=0;i<height.length-1;i++){
            for(int j=0;j<height.length-1-i;j++){
                if(height[j]<height[j+1]){
                    int t = height[j+1];
                    height[j+1] = height[j];
                    height[j] = t;
                    String tn = names[j+1];
                    names[j+1] = names[j];
                    names[j] = tn;
                }
            }
        }return names;
    }
}