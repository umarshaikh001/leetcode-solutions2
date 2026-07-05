public class FindUnsortedElementInArray {

      static int findUnsortedElement(int nums[]) {

        int n = nums.length;

        for(int i=0;i<n-1;i++) {
            if(nums[i] > nums[i+1]) {

                return nums[i];
                
              

            }
            
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,4,3,5};
        System.out.println(findUnsortedElement(arr));
        
    }
    
}
