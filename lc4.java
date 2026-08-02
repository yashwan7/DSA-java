public class lc4 {
//class Solution {
  //  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
  //      int [] arr = new int [nums1.length+nums2.length];
  ///      int c=0;int i=0; int j=0;
  ///      while(i<nums1.length&&j<nums2.length)
  //          {
  //              if(nums1[i]<=nums2[j])
  //              {
  //                  arr[c]=nums1[i];
  //                  c++; i++;
  ///              }
  //              else
  ///              {
  //                  arr[c]=nums2[j];
  //                  c++;
  //                  j++;
  //              }
  //          }
  //      if(i==nums1.length&&j<nums2.length)
  //      {
  //          while(c<arr.length)
  //          {
  //              arr[c]=nums2[j];
  //              c++; j++;
  //          }
  //      }
  //      else if(i<nums1.length&&j==nums2.length)
  //      {
  //          while(c<arr.length)
  //          {
  //              arr[c]=nums1[i];
  //              c++; i++;
  ///          }
  //      }
  //      double res=0.0;
  ///      if(arr.length%2==0)
  //      {
  ///          res=(arr[arr.length/2]+arr[(arr.length/2)-1])/2.0;
  //      }
  //      else if(arr.length%2==1)
  //      {
  //          res=arr[(arr.length-1)/2];
  //      }
  //      return res;
  //  }
//}
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        // Always perform binary search on the smaller array
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int m = nums1.length;
        int n = nums2.length;
        int low = 0;
        int high = m;
        while (low <= high) {
            // Partition index in nums1
            int cut1 = (low + high) / 2;
            // Partition index in nums2
            int cut2 = (m + n + 1) / 2 - cut1;
            // Elements around partition in nums1
            int left1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
            int right1 = (cut1 == m) ? Integer.MAX_VALUE : nums1[cut1];
            // Elements around partition in nums2
            int left2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];
            int right2 = (cut2 == n) ? Integer.MAX_VALUE : nums2[cut2];
            // Correct partition found
            if (left1 <= right2 && left2 <= right1) {
                // Odd total elements
                if ((m + n) % 2 == 1) {
                    return Math.max(left1, left2);
                }
                // Even total elements
                return (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
            }
            // Move partition left
            else if (left1 > right2) {
                high = cut1 - 1;
            }
            // Move partition right
            else {
                low = cut1 + 1;
            }
        }
        return 0.0;
    }
}
}
