class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;

        int be = nums[0];
        int de = nums[0];
        int ans = nums[0];
        int res = nums[0];

        for(int i=1;i<n;i++){

            int v1 = be + nums[i];
            int v2 = nums[i];
            int v3 = de + nums[i];

            be = Math.max(v1,v2);
            de = Math.min(v3,v2);

            ans = Math.max(ans,be);
            res = Math.min(res,de);
        }
        return Math.max(Math.abs(ans),Math.abs(res));
        
    }
}