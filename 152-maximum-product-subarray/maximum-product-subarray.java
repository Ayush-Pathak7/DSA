class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;

        int res = nums[0];
        int minEd = nums[0];
        int maxEd = nums[0];

        for(int i=1;i<n;i++){

            int v1 = nums[i];
            int v2 = minEd * nums[i];
            int v3 = maxEd * nums[i];

            minEd = Math.min(v1,Math.min(v2,v3));
            maxEd = Math.max(v1,Math.max(v2,v3));

            res = Math.max(res,Math.max(minEd,maxEd));
        }
        return res;
        
    }
}