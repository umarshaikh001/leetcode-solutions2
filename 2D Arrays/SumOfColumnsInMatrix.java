import java.util.ArrayList;
import java.util.List;

public class SumOfColumnsInMatrix {

     static List<Integer> sumOfColumns(int matrix[][]) {
        List<Integer> output = new ArrayList<>();

        int n = matrix.length;
        int m = matrix[0].length;

        for(int col=0;col<m;col++) {
            int sum =0;
            for(int row=0;row<n;row++) {
                sum += matrix[row][col];
            }
            output.add(sum);
        }
        return output;
    }
    public static void main(String[] args) {
        
        
    }
    
}
