import java.util.HashMap;

public class mostfrequentevenelement {

    public int mostFrequentEven(int[] nums) {
         HashMap<Integer, Integer> map = new HashMap<>();
        // Count frequency
        int ans = -1; int maxFreq = 0;
        for (int i = 0; i < nums.length; i++) {
  
   if(nums[i]%2==1){ continue ; }
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }  } 
       //return most frequency 
   
    for(int j = 0 ; j <nums.length ;j++)
   {   if(nums[j]%2==1){ continue ; }
        
    int freq = map.get(nums[j]);

    if (freq > maxFreq) {
    maxFreq = freq;
    ans = nums[j];
  } 
   else if (freq == maxFreq && nums[j] < ans) {
    ans = nums[j];
    }
  }
        return ans;   }
   }

