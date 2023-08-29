class Solution {
    public void rotate(int[] nums, int k) {
           if(k>nums.length){
            k = k%nums.length;
        }
        
        int arrk []= new int[k];
        int arrk_nums [] = new int[nums.length-k];
        int j = nums.length-k;
        int start = 0;
        for(int i = 0; i<nums.length; i++){
            if(i<k){
                arrk[i] = nums[j++];
            }
            else{
                arrk_nums[start] = nums[start];
                start++;
            }

        }
        start = 0;
        j = 0;
        for(int i = 0; i<nums.length; i++){
            if(i<arrk.length){
                nums[i] = arrk[start++];
            }
            else{
                nums[i] = arrk_nums[j++];
            }

        }
    }
}