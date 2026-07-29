public class majorityelement {

    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
// moore's algorthm , vote cancel hoti hai if num[i]!=candidate 
            if (count == 0) {
                candidate = nums[i];
            }

            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}
//class Solution {
  //  public int majorityElement(int[] nums) {
  //   HashMap<Integer, Integer> map = new HashMap<>();
  //      // Count frequency
  //      for (int i = 0; i < nums.length; i++) {
  //          if (map.containsKey(nums[i])) {
  //              map.put(nums[i], map.get(nums[i]) + 1);
    //        } else {
    //            map.put(nums[i], 1);
    //        }  } 
    //    // Find majority element
    //    for (int i = 0; i < nums.length; i++) {
    //        if (map.get(nums[i]) > nums.length / 2) {
    //            return nums[i];
    //        }} 
    //    return -1;   }
//}

