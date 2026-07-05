

public class LC283_MoveZeroes {
    static int[] moveZeroes(int nums[]) {
        int n = nums.length;

        int j=0;

        for(int i=0;i<n;i++) {

            if(nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        return nums;
    }
    public static void main(String[] args) {

         int arr[] = {1,2,3,0,0,1,0};

        int ans[] = moveZeroes(arr);

        for(int i : ans) {
            System.out.print(i + " ");
        }
        
    }
    
}
