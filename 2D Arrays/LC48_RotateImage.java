

public class LC48_RotateImage {

    static int[][] rotateMatrix(int matrix[][]) {

        int n = matrix.length;    // for row's
        int m = matrix[0].length; // for col's

       // Step 1: Transpose the matrix

        for(int row=0;row<n;row++){
            for(int col=row+1;col<m;col++) {

                // swap half of matrix element

                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }

        // Step 2: Reverse each row
        for(int row=0;row<n;row++) {
            int sCol =0;
            int eCol = n-1;

            while (sCol < eCol) {
                int temp = matrix[row][sCol];
                matrix[row][sCol] = matrix[row][eCol];
                matrix[row][eCol] = temp;
                sCol++;
                eCol--;
                
            }

        }
        return matrix;
    }
    public static void main(String[] args) {

       int nums[][] = {{1,2,3},{4,5,6},{7,8,9}};

        int n = nums.length;
        int m = nums[0].length;
        int ans [][] = rotateMatrix(nums);

       

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                System.out.print(ans[i][j] + " ");
              
            }
        }

        
    }
    
}
