import java.util.HashSet;

public class lc888 {
class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
       int sumA = 0;
        int sumB = 0;
        for (int a : aliceSizes) {
            sumA += a;
        }
        for (int b : bobSizes) {
            sumB += b;
        }
//After swapping a and b,
//sumA - a + b = sumB - b + a
int diff = (sumA - sumB) / 2;

        HashSet<Integer> set = new HashSet<>();

        for (int a : aliceSizes) {
            set.add(a);
        }
        for (int b : bobSizes) {
            int required = b + diff;

            if (set.contains(required)) {
                return new int[]{required, b};
            }
        }

        return new int[]{};
    }
}
//Time Complexity
//Calculating sums: O(n + m)
//Building HashSet: O(n)
//Searching: O(m)
//Overall: O(n + m)

//class Solution {
 //   public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
//
 //       int sumA = 0;
 //       int sumB = 0;
//
 ///       for (int a : aliceSizes) sumA += a;
 //       for (int b : bobSizes) sumB += b;
//
 //       int diff = (sumA - sumB) / 2;
//
 ////       Arrays.sort(aliceSizes);
//
 //       for (int b : bobSizes) {
//
 //           int target = b + diff;
//
 //           int start = 0;
 //           int end = aliceSizes.length - 1;
//
  //          while (start <= end) {
//
  //              int mid = start + (end - start) / 2;
//
  //              if (aliceSizes[mid] == target) {
  //                  return new int[]{target, b};
  //              } else if (aliceSizes[mid] < target) {
  //                  start = mid + 1;
  //              } else {
  //                  end = mid - 1;
  //              }
  //          }
  //      }

  //      return new int[]{};
    
  //  }
//}
}
