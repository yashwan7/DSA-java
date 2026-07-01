public class SearchInMountain {

    public int search(int[] arr, int target) {

        int peak = peakIndex(arr);

        // Search left side (ascending)
        int ans = binarySearch(arr, target, 0, peak, true);

        if (ans != -1) {
            return ans;
        }

        // Search right side (descending)
        return binarySearch(arr, target, peak + 1, arr.length - 1, false);
    }

    // Find peak element
    public int peakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    // Binary search for ascending and descending
    public int binarySearch(int[] arr, int target,
                            int start, int end,
                            boolean isAscending) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        SearchInMountain obj = new SearchInMountain();

        int[] arr = {1, 2, 4, 5, 3, 1};
        int target = 3;

        int result = obj.search(arr, target);

        System.out.println("Target found at index: " + result);
    }
}