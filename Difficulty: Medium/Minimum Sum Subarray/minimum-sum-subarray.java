class Solution {
    public int minSubarraySum(int[] arr) {
        // code here
        int n = arr.length;

        //at i=0 best ending and ans 
        int be = arr[0];
        int ans = arr[0];

        for(int i=1;i<n;i++){

            int v1 = be + arr[i];
            int v2 = arr[i];

            be = Math.min(v1,v2);
            ans = Math.min(ans,be);
        }
        return ans;
    }
}