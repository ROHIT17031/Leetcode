class Solution {
    public int[][] generateMatrix(int n) {
              int matrix [][] = new int[n][n];
        
      int topr = 0;
      int bottomr = n-1;
      int leftc = 0;
      int rightc = n-1;
      int curr = 1;
      while(curr<=n*n){
        

        for(int i = leftc; i<=rightc && curr<=n*n; i++){
            matrix[topr][i] = curr++;
        }
        topr++;
        for(int i = topr; i<=bottomr && curr<n*n; i++){
            matrix[i][rightc] = curr++;
        }
        rightc--;
        for(int i = rightc; i>=leftc && curr<=n*n; i--){
            matrix[bottomr][i] = curr++;
        }
        bottomr--;
        for(int i = bottomr; i>=topr && curr<=n*n; i--){
            matrix[i][leftc] = curr++;
        }
        leftc++;
      }
      return matrix;
    }
}