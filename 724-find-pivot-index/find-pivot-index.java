class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        for(int num : nums){
            totalSum += num;
        }

        int leftSum = 0;
        for(int i=0;i<nums.length;i++){
            // // The right sum is the total sum minus the left sum and the current element
            int rightSum = totalSum - leftSum -  nums[i];

            if(leftSum == rightSum){
                return i;
            }
            //Update Left Sum: Add nums[i] to leftSum before moving to the next index
            leftSum += nums[i];
        }
        //no pivot index
        return -1; 
    }
}