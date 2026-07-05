public class FindTargetElementInArray {

    static boolean FindTarget_ElementIn_Array(int nums[] , int target) {

        int n = nums.length;

       

      for(int i=0;i<n;i++) {
        if(nums[i] == target) {
            return true;
        }
      }

      return false;
    }

    public static void main(String[] args) {

        
        int arr[] = {1,2,5,8,6};
        boolean ans =  FindTarget_ElementIn_Array(arr, 55);

        System.out.println(ans);
        
    }
    
}
