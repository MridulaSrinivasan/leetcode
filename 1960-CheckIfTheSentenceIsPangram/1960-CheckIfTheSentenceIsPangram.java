// Last updated: 2/13/2026, 11:32:25 AM
class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] sen = new boolean[26];
        
        for (char c : sentence.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                sen[c - 'a'] = true;
            }
        }
        for (boolean letter : sen) {
            if (!letter) return false;
        }
        return true;
    }
}


