// Last updated: 2/13/2026, 11:32:59 AM
class Solution {
    public boolean isSubsequence(String s, String t) {
        char c1 [] = s.toCharArray();
        char c2 [] = t.toCharArray();
        int i = 0;
        int j = 0;
        while (i<c1.length && j<c2.length){
            if(c1[i] == c2[j]){
            i++;
            }
        j++;}
        return i == c1.length;
    }
}