class Solution {
    public int countDistinctIntegers(int[] nums) {
//             int n = nums.length;
//    int arr [] = new int[n*2];
//    Set<Integer> set = new HashSet<>();
//    int j = 0;
//    for(int i = 0; i<arr.length; i++){
//     if(i<nums.length){
//       arr[i] = nums[i];
//     }
//     else{
//       int num = nums[j];
//       int rvr = 0;
//       while(num>0){
//         int rem = num%10;
//         rvr = (rvr*10)+rem;
//         num /=10;

//       }
//       arr[i] = rvr;
//       j++;


//     }
//    }
//    for(int i = 0; i<arr.length; i++){
//     set.add(arr[i]);
//    }

//    return set.size();
        
          HashSet<Integer> set = new HashSet<>();
    for(int i = 0; i<nums.length; i++){
      set.add(nums[i]);
      int RvrN = 0;
      while(nums[i]>0){
        int rem = nums[i]%10;
        RvrN = (RvrN*10)+rem;
        nums[i]/=10;

      }
      set.add(RvrN);
    }
    return set.size();
        
        
    }
}