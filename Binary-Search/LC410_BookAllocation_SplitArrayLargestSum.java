    public class LC410_BookAllocation_SplitArrayLargestSum {

        static boolean isValidNumber(int nums[], int k , int maxPages) {

            int studentCount =1 ;
            int pages =0;

            for(int i=0;i<nums.length;i++) {

                if(pages + nums[i] <= maxPages) {
                    pages = pages + nums[i];
                }
                else {
                    studentCount++;
                    if(studentCount > k || nums[i] > maxPages) {
                        return false;
                    }
                    else {
                        pages =0;
                        pages = pages  + nums[i];
                    }
                }

            }
            return true;
        }

        static int findMaxPages(int nums[], int k) {

            if(nums.length < k ) {
                return -1;
            }

            int n = nums.length;
            int s =1;
            int sum =0;

            for(int i=0;i<n;i++) {
                sum += nums[i];
            }

            int e = sum;
            int ans =-1;

            while (s <= e) {
                int mid = s + (e-s)/2;

                if(isValidNumber(nums,k,mid)) {
                    ans = mid ;
                    e = mid -1;
                }
                else{
                    s = mid +1;
                }
                
            }
            return ans;
        }
        public static void main(String[] args) {

            int nums[] = {10,20,30,40,50};
            System.out.println(findMaxPages(nums, 2));
            
        }
        
    }
