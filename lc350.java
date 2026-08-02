import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class lc350 {
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> ans = new ArrayList<>();

        for (int num : nums2) {

            if (map.getOrDefault(num, 0) > 0) {
                ans.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        int[] res = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }

        return res;
    }
}
//class Solution {
  //  public int[] intersect(int[] nums1, int[] nums2) {
//
  //      List<Integer> ans = new ArrayList<>();
 //   /    boolean[] visited = new boolean[nums2.length];
////
    //    for (int i = 0; i < nums1.length; i++) {

 //           for (int j = 0; j < nums2.length; j++) {
//
  //              if (!visited[j] && nums1[i] == nums2[j]) {
    //                ans.add(nums1[i]);
     // /              visited[j] = true;
       //             break;
         ///       }
            //}
   //     }
//
  //      int[] result = new int[ans.size()];
//
  //      for (int i = 0; i < ans.size(); i++) {
    //        result[i] = ans.get(i);
      //  }

   //     return result;
  //  }
// }
}
