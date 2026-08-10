public class lc283 {
class Solution {
    public void moveZeroes(int[] nums) {
        int zeroes = 0 ;
        for ( int i = 0 ; i < nums.length ; i++){
            if(nums[i ]==0){
                zeroes++;
                
            } 
            else if (zeroes > 0 ){
                int t = nums[i];
                nums[i] = 0 ;
                nums[i - zeroes] = t ;
                
            }
        }
    }
}
}
