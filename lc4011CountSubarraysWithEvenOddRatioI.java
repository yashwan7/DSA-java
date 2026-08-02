public class lc4011CountSubarraysWithEvenOddRatioI {
class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
       int n = nums.length ;
        int count =0;
        for(int i = 0 ; i < n ; i ++){
            int x = 0 ; 
            int y = 0 ;
             for (int j = i ; j < n ; j ++){
                 if (nums[j ]%2== 0){
                     x++ ;
                     
                 } else {
                     y++ ;
                 }
                 if (y > 0 && (long )x *b <= (long)y *a){
                     count ++ ;
                 }
        } }
            return count ;
    }
}
}
