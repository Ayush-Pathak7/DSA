class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;

        if(n==0) return 0;

        int i = 0;

        for(int j=1;j<n;j++){
            if(nums[i] != nums[j]){
            i++;
            nums[i]=nums[j];
            }
        }
        return i+1;


        //we can use hashset for storing unique elements but it will have space complexity of -> 0(N)
        //but using this we have  space complexity O(1)

        
        
    }
}