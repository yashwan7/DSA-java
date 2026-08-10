public class lc912 {
//class Solution {
  //  public int[] sortArray(int[] arr) {
  //    int  n = arr.length ;
  //   for (int i = 0; i < n - 1; i++) {
//
  //      for (int j = 0; j < n - 1 - i; j++) {
//
  //          if (arr[j] > arr[j + 1]) {
  //              int temp = arr[j];
  //              arr[j] = arr[j + 1];
  //              arr[j + 1] = temp;
  //          }}
  //      }
  //      return arr ;
  ///  }
//}//
class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void mergeSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);

        merge(nums, left, mid, right);
    }

    private void merge(int[] nums, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        while (j <= right) {
            temp[k++] = nums[j++];
        }

        for (int x = 0; x < temp.length; x++) {
            nums[left + x] = temp[x];
        }
    }
}
}
