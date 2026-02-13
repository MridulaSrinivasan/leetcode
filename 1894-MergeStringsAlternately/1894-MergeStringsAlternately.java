// Last updated: 2/13/2026, 11:32:27 AM
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sh = new StringBuilder();
        int i=0;
        int j=0;
        while(i<word1.length() || j<word2.length()){
            if(i<word1.length()){
                sh.append(word1.charAt(i++));
            }
            if(j<word2.length()){
                sh.append(word2.charAt(j++));
            }
        }return sh.toString();
    }
}