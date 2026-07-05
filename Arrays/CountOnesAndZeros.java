public class CountOnesAndZeros {

     static void countOnesAndZeros(int nums[]) {


        int n = nums.length;
        int one =0;
        int zero = 0;

       for(int i=0;i<n;i++) {
        if(nums[i] == 0) {
            zero++;
        }

        else if(nums[i] == 1) {
            one++;
        }

        
       }

       System.out.println("Zeros :" + zero);
       System.out.println("One :" + one);
    }

    public static void main(String[] args) {

         int arr[] = {0,1,1,1,2};
        countOnesAndZeros(arr);
        
    }
    
}
