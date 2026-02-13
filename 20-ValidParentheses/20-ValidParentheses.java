// Last updated: 2/13/2026, 11:33:56 AM
class Solution {
    public boolean isValid(String s) {
        
        if (s.isEmpty()) return true;
        if (s.length() % 2 != 0) return false; 
        String replaced = s.replace("()", "")
                           .replace("{}", "")
                           .replace("[]", "");        
        if (replaced.length() == s.length()) return false;
        return isValid(replaced);
    }
}
