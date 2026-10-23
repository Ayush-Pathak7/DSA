class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int low = 0;
        int maxlen = 0;

        for(int high = 0;high<n;high++){
            //1. add high (current fruit to the basket)
            int currentfruit = fruits[high];
            map.put(currentfruit,map.getOrDefault(currentfruit,0)+1);

            //2. shrink window if we have more than two type of fruits
            while(map.size()>2){
                int leftfruit = fruits[low];
                map.put(leftfruit,map.get(leftfruit)-1);

                if(map.get(leftfruit)==0){
                    map.remove(leftfruit);
                }

                low++;
            }

            //3. maximum fruits collected so far
            maxlen = Math.max(maxlen,high-low+1);
        }
        return maxlen;
        
    }
}