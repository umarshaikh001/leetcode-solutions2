public class LC2187_MinimumTimeToCompleteTrips {

     static boolean isValidAns(int[] time , int totalTrip , int minTime) {

        int tripCount = 0;

        for(int i=0;i<time.length;i++) {
            
            tripCount += minTime / time[i] ;

             if(tripCount == totalTrip) {
                return true;
             }
            
        }
        
        return false;
    }

    static int minimumTime(int[] time, int totalTrip) {

        int s = 1;
        int minTime = Integer.MAX_VALUE;

        for(int t : time) {
            minTime = Math.min(t, minTime);
        }

        int e  = minTime * totalTrip;
        int ans = -1;

        while (s <= e) {

            int mid = s + (e-s)/2;

            if(isValidAns(time, totalTrip, mid)) {

                ans  = mid;
                e = mid - 1;
            }
            else {
                s = mid + 1;
            }
            
        }
        return ans;
    }
    public static void main(String[] args) {
        int time[] = {1,2,3};
        System.out.println(minimumTime(time, 5));
    }
    
}
