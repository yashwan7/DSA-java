public class lc75 {
////class Solution {
    //public void sortColors(int[] nums) {
    // for (int i = 0; i < nums.length - 1; i++) {
    //for (int j = 0; j < nums.length - 1 - i; j++) {
//
    //    if (nums[j] > nums[j + 1]) {
    //        int temp = nums[j];
    //        nums[j] = nums[j + 1];
    //        nums[j + 1] = temp;
    //    }
    //}
    //}}
//}     Dutch National Flag Algorithm.
class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;
            }

            else if (nums[mid] == 1) {
                mid++;
            }

            else { // nums[mid] == 2
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }
}    
}
git status
git add lc75.java
git commit -m "Implemented Dutch National Flag Algorithm for sorting colors in lc75.java"
