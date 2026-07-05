public class SwapAlternativeElementsInArray {

    static void swapAlternativeElements(int nums[]) {

        int n = nums.length;

        int start=0;
        int end = n-1;

        while ( start <= end) {

            if(nums[start] == nums[end]) {
                System.out.print(nums[start] + " ");
                start++;
            }

            else {
                System.out.print(nums[start] + " ");
                System.out.print(nums[end] + " ");
                
                 
            }
             start++;
             end--;

          
            
        }
       

    }

       public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};
       swapAlternativeElements(arr);
        
    }
    
}
