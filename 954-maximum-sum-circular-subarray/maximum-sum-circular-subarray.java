class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;

        int be = nums[0];
        int de = nums[0];
        int ans = nums[0];
        int res = nums[0];
        int sum = nums[0];

        for(int i=1;i<n;i++){
            sum += nums[i]; 

            int v1 = nums[i];
            int v2 = be + nums[i];
            int v3 = de + nums[i];

            be = Math.max(v1,v2);
            de = Math.min(v1,v3);
            ans = Math.max(ans,be);
            res = Math.min(res,de);
        }
        // EDGE CASE FIX: If all elements are negative, sum - res equals 0. 
        // We must return the max non-empty subarray instead.
        if(ans<0){
            return ans;
        }
        return Math.max(ans,sum-res);

        
    }
}