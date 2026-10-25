class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        
        //initialize best ending and ans at i = 0
        int be = nums[0];
        int ans = nums[0];

        for(int i =1;i<n;i++){

            int v1 = be + nums[i];
            int v2 = nums[i];

            be = Math.max(v1,v2);
            ans = Math.max(ans,be);
        }
        return ans;
        
    }
}