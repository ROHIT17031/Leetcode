class Solution {
    public void rotate(int[] nums, int k) {
   k= k%nums.length;
     int ans [] = new int[nums.length];
     int i = 0;
     int n = nums.length-k;
     for (int j = n; j < nums.length; j++) {
        ans[i++] = nums[j];
        
     }

     for(int j = 0; j<nums.length-k; j++){
        ans[i++] = nums[j];
     }
   for( i = 0; i<ans.length; i++){
    System.out.print(ans[i] + " ");
   }
   for(int j = 0; j<ans.length; j++){
    nums[j] = ans[j];
   }
  
    }
}