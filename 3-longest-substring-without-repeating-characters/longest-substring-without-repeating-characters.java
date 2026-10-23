import java.util.Arrays;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxlen = 0;
        int low = 0; // Left pointer of the window
        
        // Single frequency array for all ASCII characters
        int[] hash = new int[256]; 

        // 'high' acts as the right pointer of the window
        for (int high = 0; high < n; high++) {
            char currentClass = s.charAt(high);

            // If the character is already in our window, 
            // shrink the window from the left until the duplicate is removed
            while (hash[currentClass] == 1) {
                hash[s.charAt(low)] = 0; // Remove the left-most character
                low++;                  // Slide the left pointer forward
            }

            // Add the current character to the window
            hash[currentClass] = 1;

            // Update the maximum length found so far
            int len = high - low + 1;
            maxlen = Math.max(maxlen, len);
        }
        
        return maxlen;
    }
}
