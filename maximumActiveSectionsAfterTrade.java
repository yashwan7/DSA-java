public class maximumActiveSectionsAfterTrade {
    public int maxActiveSectionsAfterTrade(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        int ones = 0;
        for (char c : arr) {
            if (c == '1') ones++;
        }
        int bestGain = 0;
        int prevZero = 0;
        int oneLen = 0;
        int leftZero = 0;

        int i = 0;

        // Leading zero run (acts like augmented 1)
        while (i < n && arr[i] == '0') {
            prevZero++;
            i++;
        }

        while (i < n) {
            // Count one run
            oneLen = 0;
            while (i < n && arr[i] == '1') {
                oneLen++;
                i++;
            }

            leftZero = prevZero;

            // Count next zero run
            prevZero = 0;
            while (i < n && arr[i] == '0') {
                prevZero++;
                i++;
            }

            // One run is removable only if surrounded by zeros
            if (leftZero > 0 && prevZero > 0) {
                bestGain = Math.max(bestGain, leftZero + prevZero);
            } }

        return ones + bestGain;
    }}

