public class sortedgcdpairqueries {

    public int[] gcdValues(int[] nums, long[] queries) {
        int maxVal = 0;
        for (int num : nums) {
            if (num > maxVal) {
                maxVal = num;
            }
        }
        // cnt[i] stores the frequency of number i in nums
     int[] cnt = new int[maxVal + 1];
        for (int num : nums) {
            cnt[num]++;
        }
        // exact[i] will store the exact number of pairs with gcd equal to i
   // Using long to prevent overflow since max pairs can be N*(N-1)/2 ≈ 5*10^9
   long[] exact = new long[maxVal + 1];
        
        // Calculate exactly how many pairs have gcd i by iterating backward
       for (int i = maxVal; i >= 1; i--) {
            long multiplesCount = 0;
           for (int j = i; j <= maxVal; j += i) {
                         multiplesCount += cnt[j];
            }
            
            // Maximum possible pairs formed by multiples of i
              long pairs = multiplesCount * (multiplesCount - 1) / 2;
            
            // Subtract pairs where the GCD is strictly a larger multiple of i
            for (int j = 2 * i; j <= maxVal; j += i) {
                pairs -= exact[j];
            }
            
            exact[i] = pairs;
        }
        // Build prefix sums to find the GCD value for any given index
        long[] pref = new long[maxVal + 1];
      for (int i = 1; i <= maxVal; i++) {
            pref[i] = pref[i - 1] + exact[i];
        }
        
        // Answer each query using binary search
        int[] ans = new int[queries.length];
        for (int k = 0; k < queries.length; k++) {
                    long q = queries[k];
            
            // Binary search equivalent to bisect_right: 
            // Find the smallest index `mid` where pref[mid] > q
            int left = 1;
            int right = maxVal;
            int ansIdx = maxVal;
            
       while (left <= right) {
            int mid = left + (right - left) / 2;
               if (pref[mid] > q) {
                   ansIdx = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            
            ans[k] = ansIdx;
        }
        
        return ans;
    }
}

