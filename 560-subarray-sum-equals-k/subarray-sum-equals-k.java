class Solution {
    public int subarraySum(int[] nums, int k) {
        /*int n = nums.length;
        int count = 0;

        for(int i=0;i<n;i++){
            int sum = 0;

            for(int j=i;j<n;j++){
                sum += nums[j];

                if(sum==k){
                    count++;
                }
            }
            
        }
        return count;*/

        int count = 0;
        int prefixSum = 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        //Base Case
        map.put(0,1);

        for(int num : nums){
            prefixSum += num;

            int target = prefixSum -k;

            if(map.containsKey(target)){
                count += map.get(target);
            }
            //add/update the frequency of the current prefixSum
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }
        return count;     
    }
}