public class ReverseArray {

    static int[] reverseArray(int nums[]) {


        int n = nums.length;
        int start =0;
        int end = n -1;

        while (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
            
        }
        return nums;
    }
    public static void main(String[] args) {
          int arr[] = {1,2,3,4,5};

        int ans[] = reverseArray(arr);

        for(int i : ans) {
            System.out.print(i + " ");
        }
        
    }
    
}
