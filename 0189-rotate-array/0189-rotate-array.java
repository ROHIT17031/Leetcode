class Solution {
    public void rotate(int[] nums, int k) {

       k = k%nums.length;
        int s = 0;
        int l = nums.length-k-1;
        while(s<l){
            int t = nums[s];
            nums[s] = nums[l];
            nums[l] = t;
            s++;
            l--;

        }
        s = nums.length-k;
         l = nums.length-1;
         while (s<l) {
            
             int t = nums[s];
            nums[s] = nums[l];
            nums[l] = t;
            s++;
            l--;
         }
         s = 0;
         l = nums.length-1;
         while (s<l) {
              int t = nums[s];
            nums[s] = nums[l];
            nums[l] = t;
            s++;
            l--;
            
         }
    }
}