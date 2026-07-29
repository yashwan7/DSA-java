public class majorityelement2 {

    public List<Integer> majorityElement(int[] nums) {
        int candidate1 = 0;
        int candidate2 = 0;
        int count1 = 0;
        int count2 = 0;
        // Find possible candidates
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == candidate1) {
                count1++;    } 
            else if (nums[i] == candidate2) {
                count2++;    } 
            else if (count1 == 0) {
                candidate1 = nums[i];
                count1 = 1;      } 
          else if (count2 == 0) {
                candidate2 = nums[i];
                count2 = 1;    } 
            else {
                count1--;
                count2--;  }  }
        // Verify frequencies
        count1 = 0;
        count2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == candidate1) {
                count1++;
            } else if (nums[i] == candidate2) {
                count2++;   }
        }
        List<Integer> ans = new ArrayList<>();
        if (count1 > nums.length / 3) {
            ans.add(candidate1);
        }

        if (count2 > nums.length / 3) {
            ans.add(candidate2); }
        return ans;
    }
}






//class Solution {
  //  public List<Integer> majorityElement(int[] nums) {
///
  //      Arrays.sort(nums);
//
  //      List<Integer> ans = new ArrayList<>();

  //      int count = 1;
//
  //      for (int i = 1; i < nums.length; i++) {
//
  //          if (nums[i] == nums[i - 1]) {
  //              count++;
  //          } else {
//
  //              if (count > nums.length / 3) {
  //                  ans.add(nums[i - 1]);
  //              }
//
  //              count = 1;
  //          }
  //      }
//
  //      // Check the last element
  //      if (count > nums.length / 3) {
  //          ans.add(nums[nums.length - 1]);
  //      }
//
  //      return ans;
  //  }
//}

