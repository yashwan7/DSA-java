public class numberofuniquexortriplets2 {

    public int uniqueXorTriplets(int[] nums) {
        final int MAXV = 2048; // covers XOR of values up to 1500 (11 bits)
        
        // Step 1: get unique values using a presence array
        boolean[] presentVal = new boolean[1501];
        for (int num : nums) {
            presentVal[num] = true;
        }
        int[] unique = new int[nums.length];
        int u = 0;
        for (int v = 1; v <= 1500; v++) {
            if (presentVal[v]) {
                unique[u++] = v;
            }
        }
        
        // Step 2: pairwise XOR set (a ^ b), a == b allowed
        boolean[] s2 = new boolean[MAXV];
        for (int i = 0; i < u; i++) {
            for (int j = i; j < u; j++) {
                s2[unique[i] ^ unique[j]] = true;
            }
        }
        
        // Step 3: XOR each pairwise result with every unique element -> triplet XORs
        boolean[] s3 = new boolean[MAXV];
        int count = 0;
        for (int s = 0; s < MAXV; s++) {
            if (!s2[s]) continue;
            for (int i = 0; i < u; i++) {
                int val = s ^ unique[i];
                if (!s3[val]) {
                    s3[val] = true;
                    count++;
                }
            }
        }
        
        return count;
    }
}

