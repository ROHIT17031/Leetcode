class Solution {
    public int minOperations(int n) {
            int arr [] = new int[n];
    for(int i = 0; i<n; i++){
      arr[i] = (2*i)+1;
    }
     int mid = n/2;
     int minop = 0;
    for(int i = 0; i<arr.length; i++){
        int rem = (Math.abs(arr[mid]-arr[i]));
          minop += rem/2;
    }
    return minop;
    }
}