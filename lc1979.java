public class lc1979 {
class Solution {
    public int findGCD(int[] nums) {
        int small = nums[0];
        int big = nums[0];
        for (int n : nums) {
            if (n < small) {
                small = n;
            }
            if (n > big) {
                big = n;
            }  }
        for (int m = small; m >= 1; m--) {
            if (small % m == 0 && big % m == 0) {
                return m;
            }
        }  return 1;
    }
} //Euclidean Algorithm – O(n + log(min))
//class Solution {
  //  public int findGCD(int[] nums) {
//
  ///      int small = nums[0];
     //   int big = nums[0];
///
   //     for (int n : nums) {
     //       small = Math.min(small, n);
       //     big = Math.max(big, n);
        //}

     //   while (big != 0) {
       //     int temp = big;
         //   big = small % big;
           // small = temp;
      //  }
//
  //      return small;
    //}
//}
}
