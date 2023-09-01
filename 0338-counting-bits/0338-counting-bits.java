class Solution {
    public int[] countBits(int n) {
//              int ans [] = new int[n+1];
//         int k = ans.length-1;
//         while(n>=0){
//             int count = 0;
//             int t = n;
//             while(t>0){
//                 int d = t%2;     //tc o(nlogn)
//                 if(d==1){
//                     count++;
//                 }
//                 t /=2;
//             }

//             ans[k--] = count;
//             n--;

//         }
//         return ans;
        
          int[] ans = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;
    }
}