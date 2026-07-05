public class LC1_TwoSum {
         static int[] twoSum(int nums[] , int target) {
        int n= nums.length;

        for(int i=0;i<n-1;i++) {
            for(int j=1;j<n;j++) {

                if(nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int [] {};
    }
    public static void main(String[] args) {

          int arr[] = {1,5,68,9,5};
        int ans [] =  twoSum(arr, 69);

        for(int i : ans) {
            System.out.print(i + " ");
        }
        
    }
    
}
