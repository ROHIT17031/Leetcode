class Solution {
    public void rotate(int[][] matrix) {
       for (int i = 0; i < matrix.length; i++) {
        for (int j = i; j < matrix[0].length; j++){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
            
        }
        
    }

     for (int i = 0; i < matrix.length; i++) {

        int fc = 0;
        int lc = matrix[0].length-1;
        
        while(fc<lc){
            int temp = matrix[i][fc];
            matrix[i][fc] = matrix[i][lc];
            matrix[i][lc] = temp;
            fc++;
            lc--;
        }
        
        
     }
    //   for (int i = 0; i < matrix.length; i++) {
    //     for (int j = 0; j < matrix[0].length; j++){
    //       System.out.print( matrix[i][j]);
            
    //     }
    //     System.out.println();
        
    // }
        
    }
}