class Solution {
    public int triangularSum(int[] nums) {
    //       for(int i = 0; i<nums.length; i++){
    //   for(int j = 0; j<nums.length-1-i; j++){
    //     nums[j] = (nums[j]+nums[j+1])%10;
    //   }
    // }
    // return nums[0];
        
        
            int n = nums.length;

        while(n-- > 1)
            for(int i = 0; i < n; i++)
                nums[i] = (nums[i] + nums[i + 1]) % 10;

        return nums[0];
    }
}