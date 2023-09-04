class Solution {
    public int kthFactor(int n, int k) {
    //   ArrayList<Integer> list = new ArrayList<Integer>();

    // for(int i = 1; i<=n/2; i++){
    //   if(n%i==0){
    //     list.add(i);
    //   }
    // }
    // list.add(n);

    // return k>list.size() ? -1 : list.get(k-1);

      int count  = 0;
    int res = -1;
    for(int i = 1; i<=n; i++){
      if(n%i==0){
        count++;
      }
      if(count==k){
        res = i;
        break;
      }
    }

    return res;
    }
}