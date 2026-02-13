// Last updated: 2/13/2026, 11:33:23 AM
class Solution {
    public String reverseWords(String s) {
        String[] w = s.trim().split("\\s+"); // split by spaces
        StringBuilder rev = new StringBuilder();
        for (int i = w.length - 1; i >= 0; i--) {
            rev.append(w[i]);
            if (i != 0) {
                rev.append(" ");
            }
        }
        return rev.toString();
    }
}
