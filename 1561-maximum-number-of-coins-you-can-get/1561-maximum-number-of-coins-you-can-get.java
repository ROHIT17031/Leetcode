class Solution {
    public int maxCoins(int[] piles) {
          Arrays.sort(piles);
    int s = 0;
    int l = piles.length-1;
    int maxc = 0;
    while(s<l){
    maxc += piles[l-1];
    s++;
    l -=2;


    }
    return maxc;
    }
}