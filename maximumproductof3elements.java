public class maximumproductof3elements {

    public int maximumProduct(int[] nums) {

      int first = Integer.MIN_VALUE;
      int second = Integer.MIN_VALUE;
      int third = Integer.MIN_VALUE;

     int min1 = Integer.MAX_VALUE;
      int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
  // 3 largest numbers
            if (nums[i] >= first) {
                third = second;
                second = first;
                first = nums[i];
            } else if (nums[i] >= second) {
                third = second;
                second = nums[i];
            } else if (nums[i] > third) {
                third = nums[i];  }
  // 2 smallest numbers
            if (nums[i] <= min1) {
                min2 = min1;
                min1 = nums[i];
            } else if (nums[i] < min2) {
                min2 = nums[i];
            } }
          return Math.max(first * second * third, first * min1 * min2);
    } }



//class Solution {  15 ms runtime , mera 3 ms hai but , approch$$
  //  public int maximumProduct(int[] nums) {

     //   Arrays.sort(nums);

     //   int n = nums.length;

     //   int p1 = nums[n-1] * nums[n-2] * nums[n-3];
    //    int p2 = nums[0] * nums[1] * nums[n-1];

   //     return Math.max(p1, p2);
 //   }
//}

