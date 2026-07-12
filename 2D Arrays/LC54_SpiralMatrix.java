import java.util.ArrayList;
import java.util.List;

public class LC54_SpiralMatrix {

     static List<Integer> spiralOrder(int matrix[][]) {
        List<Integer> output = new ArrayList<>();

        int n = matrix.length;
        int m = matrix[0].length;

        int sRow = 0;
        int eRow = n-1;
        int sCol = 0;
        int eCol = m-1;

        while (sCol <= eCol && sRow <= eRow) {
            
            // Step 1: Left → Right
            for(int col=sCol;col<=eCol;col++) {
                output.add(matrix[sRow][col]);
            }
            sRow++;

            // Step 2: Top → Bottom
            for(int row=sRow;row<=eRow;row++) {
                output.add(matrix[row][eCol]);
            }
            eCol--;

            if(sCol <= eCol) {
            // Step 3: Right → Left
            for(int col=eCol;col>=sCol;col--) {
                output.add(matrix[eRow][col]);
            }
            eRow--;
            }

            // Step 4: Bottom → Top

            if(sRow <= eRow) {
            for(int row=eRow;row>=sRow;row--) {
                output.add(matrix[row][sCol]);
            }
            sCol++;
            }
            
        }
        return output;
    }
    public static void main(String[] args) {
          
        int nums[][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        System.out.println(spiralOrder(nums));
        
    }
    
}
