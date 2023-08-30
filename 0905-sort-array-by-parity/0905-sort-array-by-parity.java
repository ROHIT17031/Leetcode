class Solution {
    public int[] sortArrayByParity(int[] nums) {
             int s = 0;
        int l = nums.length-1;
        while(s<l){
            if(nums[s]%2==1 && nums[l]%2==0){
                int temp = nums[s];
                nums[s] = nums[l];
                nums[l] = temp;
                s++;
                l--;
            }
          else if(nums[s]%2==0){
            s++;
          }
          else if(nums[s]%2==1 && nums[l]%2==1){
            l--;
          }


        }
        return nums;
    }
}