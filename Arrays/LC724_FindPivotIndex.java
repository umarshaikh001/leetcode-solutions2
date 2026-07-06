public class LC724_FindPivotIndex {

    static int pivotIndex(int nums[]){
        
        int n = nums.length;

        int left[] = new int[n];
        int right[] = new int[n];


        // left side sum
        left[0] = nums[0];
        for(int i=1;i<n;i++) {
           
           left[i] = left[i-1] + nums[i];
        }

        // right side sum
         right[n-1] =nums[n-1];
        for(int i=n-2;i>=0;i--) {
           
            right[i] = right[i+1] + nums[i];
        }

        for(int i=0;i<n;i++) {
            
            if(left[i]== right[i]) {
                    return i;
                }
            }
        return -1;
    }
    public static void main(String[] args) {

          int [] nums ={1,2,3,4,5,1};
        System.out.println(pivotIndex(nums));
        
    }
    
}
