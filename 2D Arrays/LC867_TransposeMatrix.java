

public class LC867_TransposeMatrix {

     static int[][] transposeMatrix(int matrix[][]) {

        if(matrix == null || matrix.length ==0) {
            return new int [0][0];
        }

        int n = matrix.length;
        int m = matrix[0].length;
        int newMatrix[][] = new int[m][n];

        for(int row=0;row<n;row++) {
            for(int col=0;col<m;col++) {
                
                newMatrix[col][row] = matrix[row][col];
            }
        }

        return newMatrix;
    }

    
    public static void main(String[] args) {

         int nums[][] = {{1,2,3},{4,5,6}};
        
        int ans [][] = transposeMatrix(nums);
        for(int i=0;i<ans.length;i++) {
            for(int j=0;j<ans[0].length;j++) {
                System.out.print(ans[i][j] + " ");
              
            }
        }

        
    }
    
}
