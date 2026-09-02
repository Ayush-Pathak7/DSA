class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        /* Brute force with break to prevent overflow
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            long product = 1;

            for (int j = i; j < nums.length; j++) {

                product *= nums[j];

                if (product < k) {
                    count++;
                }
                else {
                    break;
                }
            }
        }

        return count;*/

        int n = nums.length;
        if (k <= 1) return 0;

        int left = 0;
        int product = 1;
        int count = 0;

        for(int i=0;i<n;i++){
            product *= nums[i];

            while(product >= k){
                product /= nums[left];
                left++;
            }
            count += i - left + 1;
        }
        return count;
    }
}