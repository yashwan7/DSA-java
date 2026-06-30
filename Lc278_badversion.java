class VersionControl {
    int firstBad = 4;   // testing purpose

    boolean isBadVersion(int version) {
        return version >= firstBad;
    }
}

public class Lc278_badversion extends VersionControl {

    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        Lc278_badversion obj = new Lc278_badversion();

        System.out.println(obj.firstBadVersion(8));
    }
}
