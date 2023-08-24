class Solution {
    public int longestConsecutive(int[] nums) {
          HashSet<Integer> set = new HashSet<>();
        for(var num : nums) set.add(num);

        int maxlen = 0;

        for(int num : set){
            if(!set.contains(num-1)){
                int currnum = num;
                int currstrek = 1;
                while(set.contains(currnum+1)){
                    currnum++;
                    currstrek++;
                }

                maxlen = Math.max(maxlen, currstrek);
            }
        }
        return maxlen;
    }
}