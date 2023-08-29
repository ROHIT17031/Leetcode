class Solution {
    public String frequencySort(String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        List<Character> [] bucket = new List[s.length()+1];
        for(Character key : map.keySet()){
            int f = map.get(key);
            if(bucket[f]==null){
                bucket[f] = new ArrayList<>();
            }
            bucket[f].add(key);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = bucket.length-1; i>=0; i--){
            if(bucket[i]!=null){
                for(char c : bucket[i]){
                    for(int j = 0; j<map.get(c); j++){
                        sb.append(c);
                    }
                }
            }
        }
        return sb.toString();
    }
}