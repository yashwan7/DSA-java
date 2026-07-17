public class Runningsumof1darray {
    public int[] runningSum(int[] nums) {
      for (int i = 1 ; i < nums.length  ; i++)
        // int i is not 0 because the first element shld remain same and 
        // the previous index value keep on getting added nums[i-1] .
    {   nums[i] = nums[i]+ nums[i-1];
        
    }  return nums;
    }
}

