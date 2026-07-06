import java.util.ArrayList;
import java.util.List;

public class LC448_FindAllNumbersDisappearedInAnArray {

     static List<Integer> findMissingElement(int nums[]) {
        List<Integer> output = new ArrayList<>();
        int n = nums.length;

        for(int i=0;i<n;i++) {
            int value =Math.abs(nums[i]);
            int postion = value-1;

            if(nums[postion] > 0) {

            nums[postion] = -nums[postion];
            }
        }

        for(int i=0;i<n;i++) {
            if(nums[i] > 0) {
                output.add(i+1);

            }
        }

        return output;
    }

    public static void main(String[] args) {
          int [] nums ={1,1,2,3,5,5,6,6,6};
        System.out.println(findMissingElement(nums));
        
    }

    
}
