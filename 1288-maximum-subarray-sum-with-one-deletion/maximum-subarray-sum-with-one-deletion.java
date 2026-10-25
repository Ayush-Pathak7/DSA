class Solution {
    public int maximumSum(int[] arr) {
        if(arr == null || arr.length == 0){
            return 0;
        }
        int n = arr.length;

        int noDel = arr[0];
        int oneDel = arr[0];
        int res = arr[0];

        for(int i=1;i<n;i++){

            int nextnoDel = Math.max(noDel + arr[i],arr[i]);

            int nextoneDel = Math.max(oneDel + arr[i],noDel);

            //update current status
            noDel = nextnoDel;
            oneDel = nextoneDel;

            res = Math.max(res,Math.max(noDel,oneDel));
        }
        return res;
    }
}