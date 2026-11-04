import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> result = new ArrayList<>();
        int n = firstList.length;
        int m = secondList.length;
        
        // 1. Declare pointers
        int i = 0; 
        int j = 0;

        while (i < n && j < m) {
            int start1 = firstList[i][0];
            int end1 = firstList[i][1];
            int start2 = secondList[j][0];
            int end2 = secondList[j][1]; // Fixed typo 'ssecondList'

            // 2. Find the boundary points of the potential overlap
            int s = Math.max(start1, start2); // 
            int e = Math.min(end1, end2);     // 

            // 3. If they overlap, add the intersection to the list
            if (s <= e) {
                result.add(new int[]{s, e}); // Fixed syntax for adding an array to List
            }

            // 4. Move the pointer pointing to the interval that ends first
            if (end1 <= end2) {
                i++;
            } else {
                j++;
            }
        }
        
        return result.toArray(new int[result.size()][]);
    }
}
