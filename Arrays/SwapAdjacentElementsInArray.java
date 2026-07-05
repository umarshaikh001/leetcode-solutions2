public class SwapAdjacentElementsInArray {

     static int[] swapAdjacentElements(int nums[]) {

        int n = nums.length;
        

        for(int i=0;i<n-1;i+=2){
          
                int temp =  nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            
        }
        return nums;
    }
    public static void main(String[] args) {
        
        int arr[] = {1,2,4,3,5};
        int ans[] = swapAdjacentElements(arr);

        for(int i : ans) {
            System.out.print(i + " ");
        }
        
    }
    
}
