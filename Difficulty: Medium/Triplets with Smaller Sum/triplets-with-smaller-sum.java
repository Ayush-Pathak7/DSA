class Solution {
    int countTriplets(int sum, int arr[]) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        int count = 0;
        
        
        for(int i=0;i<n;i++){
            
            int left = i+1;
            int right = n-1;
            
            while(left<right){
                int add = arr[i]+arr[left]+arr[right];
            
                if(add<sum){
                    count += right - left;
                    left++;
                }
                else{
                    right--;
                }
            }  
            
        }
        return count;
    }
}