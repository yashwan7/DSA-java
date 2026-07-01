public class MountainArray {

    public int peakIndexInMountainArray(int[] arr) {
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

    public static void main(String[] args) {
        MountainArray obj = new MountainArray();

        int[] arr = {0, 2, 5, 3, 1};

        int result = obj.peakIndexInMountainArray(arr);

        System.out.println("Peak index: " + result);
    }
}