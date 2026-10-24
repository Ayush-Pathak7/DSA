class Solution {
    public int findDuplicate(int[] nums) {
       // int n = nums.length;

       // Arrays.sort(nums);

       // for(int i=0;i<n-1;i++){
       //     if(nums[i]==nums[i+1]){
         //       return nums[i];
           // }
        //}
        //return -1;



      // slow fast pointer approach floyed cycle detection
        int slow = nums[0];
        int fast = nums[0];

        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow!=fast);

        slow = nums[0];

        while(slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
        
    }
}