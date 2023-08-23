class Solution {
    public int[] twoSum(int[] arr, int target) {
   Map<Integer,Integer> mp = new HashMap<>();
  for(int i = 0; i<arr.length; i++){
    int num = target-arr[i];
    if(mp.containsKey(num)){
      return new int [] {i, mp.get(num)};
    }
    mp.put(arr[i],i);
  }

  return new int[]{-1};
        
    }
}