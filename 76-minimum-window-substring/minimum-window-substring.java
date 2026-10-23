class Solution {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) return "";

        // Frequency map for characters in t
        int[] freq = new int[128];
        for (char c : t.toCharArray()) {
            freq[c]++;
        }

        int left = 0, right = 0;
        int required = t.length();
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {
            char r = s.charAt(right);
            // If character in s is part of t, decrease required
            if (freq[r] > 0) {
                required--;
            }
            freq[r]--;
            right++;

            // When we have all characters
            while (required == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    start = left;
                }

                
                char l = s.charAt(left);
                
                // Add the character back to the frequency map as it leaves the window
                freq[l]++;
                
                // If it goes above 0, it means a character required by string t is missing
                if (freq[l] > 0) {
                    required++;
                }
                
                left++; // Shrink the window from the left
            }
        }

        // Return empty string if no valid window was found, otherwise return the substring
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
