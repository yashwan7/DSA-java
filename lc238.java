public class lc238 {
//class Solution {
  //  public int[] productExceptSelf(int[] nums) {
  //      int n = nums.length;
  //      int[] a1 = new int[n];
  //      int[] a2 = new int[n];
  //      a1[0] = 1;
  //      a2[n - 1] = 1;
  //      for (int i = 1; i < n; i++) {
  ////          a1[i] = a1[i - 1] * nums[i - 1];
///
  ///          int j = n - 1 - i;
  ///          a2[j] = a2[j + 1] * nums[j + 1];
  ///      }
  ////  
  ///      for (int i = 0; i < n; i++) {
  ///          nums[i] = a1[i] * a2[i];
  ///      }
//
  //      return nums;
  //  }
//}
class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        // Store left products in ans
        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        // Multiply by right products
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return ans;
    }
}
}
