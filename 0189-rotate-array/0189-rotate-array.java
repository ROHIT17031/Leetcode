class Solution {
    public static void rotate(int[] nums, int k) {
     k = k%nums.length;
    reverse(nums, 0, nums.length-k-1);
    reverse(nums, nums.length-k, nums.length-1);
    reverse(nums, 0, nums.length-1);

//     for (int i = 0; i < nums.length; i++) {
//         System.out.print(nums[i] + " ");
        
//     }
   

 }
 public static void reverse(int nums[], int start, int end){
    
    while(start < end){
        // Swap elements at start and end indices
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        // Increment start index and decrement end index
        start++;
        end--;
    }
}
}