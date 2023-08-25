class Solution {
    public int minOperations(int n) {
    //         int arr [] = new int[n];
    // for(int i = 0; i<n; i++){
    //   arr[i] = (2*i)+1;
    // }
    //  int mid = n/2;
    //  int minop = 0;
    // for(int i = 0; i<arr.length; i++){
    //     int rem = (Math.abs(arr[mid]-arr[i]));
    //       minop += rem/2;
    // }
    // return minop;
        
        //--------------------------------------------
//           int mid = n/2;
//    int minop = 0;
//     for(int i = 0; i<n; i++){
    
//      minop += (Math.abs(mid-i)); // no extera space used so optimization
//     }                        tc O(n)
//     return minop;
        
        //--------------------------------------------
        
          int ans = 0;
        
  if (n % 2 == 0) {
      ans = (n / 2) * (n / 2);
  } else {
      ans = ((n - 1) / 2) * ((n + 1) / 2);     //tc O(1)
  }
  
  return ans;
        
  }
        
    
}