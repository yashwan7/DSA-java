public class lc1464maxproductoftwoeleminanarrray {

    public int maxProduct(int[] nums) {
     
      int first = Integer.MIN_VALUE;
      int second = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
  // 3 largest numbers
            if (nums[i] >= first) {
                
                second = first;
                first = nums[i];
            } else if (nums[i] >= second) {
                
               second = nums[i];
        }    } 
                return (int)(first-1)*(second-1);
    }
}

