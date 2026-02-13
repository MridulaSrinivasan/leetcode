// Last updated: 2/13/2026, 11:33:30 AM
class Solution {
    public boolean isPalindrome(String s) {
            StringBuilder a = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                a.append(Character.toLowerCase(c));
            }
        }
        int left = 0;
        int right =a.length() - 1;
        
        while (left < right) {
            if (a.charAt(left) != a.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}
  
