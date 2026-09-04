class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;

        int [] sorted = nums.clone();

        Arrays.sort(sorted);

        int left = 0;
        int right = n-1;

        //compare form left find first difference
        while(left<n && nums[left]==sorted[left]){
            left++;
        }

        // already sorted
        if(left == n){
            return 0;
        }

        //compare form right find last difference
        while(right>=0 && nums[right]==sorted[right]){
            right--;
        }

        return right - left +1;    
    }
}