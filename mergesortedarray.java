public class mergesortedarray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       for (int i = 0; i < n; i++) {
    nums1[m + i] = nums2[i];
} // should solve again after three pointer concept , not an optimal sol using bubble sort 
        for (int i = 0; i < nums1.length - 1; i++){
            for (int j = 1; j < nums1.length - i; j++) {
                if (nums1[j] < nums1[j - 1]) {
                    int temp = nums1[j];
                    nums1[j] = nums1[j - 1];
                    nums1[j - 1] = temp;}}
                  } 
    } 
}  

