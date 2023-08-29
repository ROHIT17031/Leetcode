class Solution {
    public int[] topKFrequent(int[] nums, int k) {
              HashMap<Integer,Integer> mp = new HashMap<>();
        List<Integer> [] bucket = new ArrayList[nums.length+1];

        for(var i : nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        for(Integer key : mp.keySet()){
            int freq = mp.get(key);
            if(bucket[freq]==null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        int ans [] = new int[k];
        int count = 0;
        for(int i = bucket.length-1; i>=0; i--){
            if(bucket[i]!=null){
                for(int j = 0; j<bucket[i].size(); j++){
                    ans[count++] = bucket[i].get(j);
                   
                }
            }
             if(count==k){
                        break;
                    }
        }
        return ans;
    }
}