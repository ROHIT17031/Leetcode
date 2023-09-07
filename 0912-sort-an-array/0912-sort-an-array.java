class Solution {
    public int[] sortArray(int[] nums) {
           mergesort(nums, 0, nums.length-1);
        return nums;
    }
       public static void mergesort(int arr[],int s,int e){
        if(s<e){
            int mid = s+(e-s)/2;

            mergesort(arr, s, mid);
            mergesort(arr, mid+1, e);
            sort(arr, s, mid, e);

        }
    }
     public static void sort(int arr[],int s,int mid,int e){
        int brr [] = new int[e-s+1];
        int i = s;
        int j = mid+1;
        int k = 0;

        while(i<=mid && j<=e){
            if(arr[i]<arr[j]){
                brr[k++] = arr[i++];
            }
            else{
                brr[k++] = arr[j++];
            }
        }
        //remaining array
        while(i<=mid){
            brr[k++] = arr[i++];
        }
        //remaing array
        while(j<=e){
            brr[k++] = arr[j++];

        }

        //copy array
        int z = s;
        for(int y = 0; y<brr.length; y++){
            arr[z++] = brr[y];
        }

    }
}