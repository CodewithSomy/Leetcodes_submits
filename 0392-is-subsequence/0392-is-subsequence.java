class Solution {
    public boolean isSubsequence(String s, String t) {
        // Base edge cases
        if (s.equals("") || s.equals(t)) return true;
        if (t.equals("") || s.length() > t.length()) return false;
        
        // Pointers for both strings
        int sLeft = 0;
        int sRight = s.length() - 1;
        int tLeft = 0;
        int tRight = t.length() - 1;
        
        while (tLeft <= tRight && sLeft <= sRight) {
            // 1. Process Left Match
            if (t.charAt(tLeft) == s.charAt(sLeft)) {
                sLeft++;
            }
            if (sLeft > sRight) return true; // Handled all characters of s
            tLeft++;
            
            // T pointers might have crossed
            if (tLeft > tRight) break;
            
            // 2. Process Right Match
            if (t.charAt(tRight) == s.charAt(sRight)) {
                sRight--;
            }
            if (sLeft > sRight) return true; // Handled all characters of s
            tRight--;
        }
        
        // If sLeft crossed sRight, it means every character was matched
        return sLeft>sRight;
    }
}
