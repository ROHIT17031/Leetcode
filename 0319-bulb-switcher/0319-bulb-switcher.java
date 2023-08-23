class Solution {
    public int bulbSwitch(int n) {
         int ans = 0;
        for(int i = 0; i*i<=n; i++){ //tc o(1)
            ans = i;
        }
        return ans;
    }
}