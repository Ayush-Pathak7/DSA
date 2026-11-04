class Solution {
    public int minMeetingRooms(int[] start, int[] end) {
        int n = start.length;
        
        Arrays.sort(start);
        Arrays.sort(end);
        
        int room = 0;
        int res = 0;
        int i = 0;
        int j = 0;
        
        while(i<n && j<n){
            if(start[i]<end[j]){
                room++;
                res = Math.max(res,room);
                i++;
            }
            else{
                room--;
                j++;
            }
        }
        return res;
    }
}
