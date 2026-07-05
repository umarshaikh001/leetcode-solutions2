package HashMap;

import java.util.HashMap;

public class FindMaximumFrequencyElementInArray {

     static int  findMaximumFrequencyElement(int nums[]) {
        
        HashMap<Integer,Integer> ans = new HashMap<>();
        
        for(int i : nums) {
           ans.put(i, ans.getOrDefault(i, 0)+1);
         }

       int maxFreq =0;
       int maxValue =0;

       for(int i : ans.keySet()){
        int currentKey = i;
        int currentValue = ans.get(i);

        if(currentValue > maxValue) {
            maxFreq = currentKey;
            maxValue = currentValue;
          }
     }
       return maxFreq;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3,};

        System.out.println(findMaximumFrequencyElement(arr));
        
    }
    
}
