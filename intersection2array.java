import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
class intersection2array {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums2.length; i++) {
            int start = 0;
            int end = nums1.length - 1;
            while(start <= end) {
                int mid = start + (end - start) / 2;
                if(nums2[i] == nums1[mid]) {
                    set.add(nums2[i]);
                    break;
                }
                else if(nums2[i] < nums1[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        int[] ans = new int[set.size()];
        int i = 0;
        for(int num : set) {
            ans[i++] = num;
        }
        return ans;
    }

    public static void main(String[] args) {

        intersection2array obj = new intersection2array();

        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        int[] result = obj.intersection(nums1, nums2);

        System.out.println(Arrays.toString(result));
    }
}