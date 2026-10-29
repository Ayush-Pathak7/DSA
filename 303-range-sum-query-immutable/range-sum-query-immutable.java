class NumArray {
    private int[] prefixSum;

    public NumArray(int[] nums) {
        int n = nums.length;
        // prefixSum[i] stores the sum of elements from index 0 to i-1
        prefixSum = new int[n + 1];
        
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        // Sum from index 'left' to 'right' is prefixSum[right + 1] - prefixSum[left]
        return prefixSum[right + 1] - prefixSum[left];
    }
}