class Solution {
    public long zeroFilledSubarray(int[] nums) {
           long maxsub = 0;
    long count = 1;
    for(int i = 0;i<nums.length; i++){
      if(nums[i]!=0){
        count = 1;
      }
      else{
        maxsub +=count;   //tc O(n)
                          // 100% faster
        count++;

      }
    }
    return maxsub; 
    } 
}